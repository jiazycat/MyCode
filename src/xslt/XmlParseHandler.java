package xslt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlParseHandler extends DefaultHandler {
	private List<String> personlist = new ArrayList<String>();
	private String First;
	private String Last;
	private String PhoneExt;
	private String Email;
	private String Enlm;
	private String TargetFile;
	private int i = 0;
	public List<String> getPersonlist() {
		return personlist;
	}
	public void setTargetFile(String targetFile) {
		TargetFile = targetFile;
	}

	public void endElement(String arg0, String arg1, String name) throws SAXException {
		super.endElement(arg0, arg1, name);
		if (name.equals("Person")) {
			i = i + 1;
			personlist.add(First + "," + Last + "," + PhoneExt + "," + Email + ",");
		}
	}

	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
		String nodevalue;
		nodevalue = new String(ch, start, length);
		if (Enlm == "First" && First == "" && nodevalue.trim() != "") {
			First = nodevalue;
		} else if (Enlm == "Last" && Last == "" && nodevalue.trim() != "") {
			Last = nodevalue;
		} else if (Enlm == "PhoneExt" && PhoneExt == "" && nodevalue.trim() != "") {
			PhoneExt = nodevalue;
		} else if (Enlm == "Email" && Email == "" && nodevalue.trim() != "") {
			Email = nodevalue;
		}
	}

	public void startElement(String arg0, String arg1, String name, Attributes attributes) throws SAXException {
		if (name.equals("Person")) {
			First = "";
			PhoneExt = "";
			Last = "";
			Email = "";
			if (i > 1000000) {
				FileWriter fw = null;
				try {
					File f = new File(TargetFile);
					fw = new FileWriter(f, true);
				} catch (IOException e) {
					e.printStackTrace();
				}
				PrintWriter pw = new PrintWriter(fw);
				@SuppressWarnings("rawtypes")
				Iterator list = personlist.iterator();
				while (list.hasNext()) {
					pw.println(list.next());
					pw.flush();
				}
				try {
					fw.flush();
					pw.close();
					fw.close();
				} catch (Exception e) {
				}
				i = 0;
				personlist = new ArrayList<String>();
			}
		}
		Enlm = name;
		super.startElement(arg0, arg1, name, attributes);
	}
}
