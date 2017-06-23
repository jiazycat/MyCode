package xslt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class XMLtoTXT {

	public static void main(String[] args) {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		Date now = new Date();
		System.out.println(now);
		try {
			SAXParser parser = factory.newSAXParser();
			XmlParseHandler handle = new XmlParseHandler();
			handle.setTargetFile("D:/xml/abc.txt");
			parser.parse("D:/xml/fm02/CompanyFirstCopy.xml", handle);
			List<String> personlist = handle.getPersonlist();
			FileWriter fw = null;
			try {
				File f = new File("D:/xml/abc.txt");
				fw = new FileWriter(f, true);
			} catch (IOException e) {
				e.printStackTrace();
			}
			PrintWriter pw = new PrintWriter(fw);
			Iterator<String> list = personlist.iterator();
			while (list.hasNext()) {
				pw.println(list.next());
			}
			pw.flush();
			try {
				fw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
			fw.close();
			
		} catch (Exception e) {
		}
		Date now1 = new Date();
		System.out.print(now1);
	}
}
