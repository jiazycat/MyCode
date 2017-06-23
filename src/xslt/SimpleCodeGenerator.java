package xslt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class SimpleCodeGenerator {

	public void Generator(String xmlSourceFile, String xslSourceFile, String ResultFile) {
		try {
			StreamSource xmlSource = new javax.xml.transform.stream.StreamSource(new File(xmlSourceFile));

			javax.xml.transform.Source xslSource = new javax.xml.transform.stream.StreamSource(new File(xslSourceFile));

			javax.xml.transform.Result result = new javax.xml.transform.stream.StreamResult(new File(ResultFile));

			Transformer transformer = TransformerFactory.newInstance().newTransformer(xslSource);

			transformer.transform(xmlSource, result);

		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("D:/xml/output.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Date StartNow = new Date();
			System.out.println(StartNow);
			new SimpleCodeGenerator().Generator("C:/Users/zyjia/Desktop/xml/CompanyFirst.xml",
					"E:/jiazy/xslt/company01.xsl", "C:/Users/zyjia/Desktop/xml/b.txt");
			Date EndNow = new Date();
			System.out.println(EndNow);

		}

	}
}
