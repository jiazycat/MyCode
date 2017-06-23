package xslt;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class sales {

	public void writeFile(String filename, int lop) {
		try {
			FileWriter fw = null;
			File f = new File("D:/xml/fmwin/Sales." + filename);
			fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);

			pw.println("<Sales>");
			for (int i = 0; i < lop; i++) {

				if (filename == "txt") {
					pw.print("P111,");
					pw.print("P111,");
					pw.print("P111,");
					pw.print("P111,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("abc,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.print("blue,");
					pw.println("blue,");
				} else if (filename == "xml") {
					pw.println("<Item>");
					pw.println("<Key>P111</Key>");
					pw.println("<Des>P111</Des>");
					pw.println("<ShortDes>P111</ShortDes>");
					pw.println("<Owner>P111</Owner>");
					pw.println("<Rate1>abc</Rate1>");
					pw.println("<Rate2>abc</Rate2>");
					pw.println("<Rate3>abc</Rate3>");
					pw.println("<Rate4>abc</Rate4>");
					pw.println("<Rate5>abc</Rate5>");
					pw.println("<Rate6>abc</Rate6>");
					pw.println("<Rate7>abc</Rate7>");
					pw.println("<Rate8>abc</Rate8>");
					pw.println("<Rate9>abc</Rate9>");
					pw.println("<Rate10>abc</Rate10>");
					pw.println("<Rate11>abc</Rate11>");
					pw.println("<Rate12>abc</Rate12>");
					pw.println("<Rate13>abc</Rate13>");
					pw.println("<Rate14>abc</Rate14>");
					pw.println("<Rate15>abc</Rate15>");
					pw.println("<Rate16>abc</Rate16>");
					pw.println("<Rate17>abc</Rate17>");
					pw.println("<Rate18>abc</Rate18>");
					pw.println("<Rate19>abc</Rate19>");
					pw.println("<Att1>blue</Att1>");
					pw.println("<Att2>blue</Att2>");
					pw.println("<Att3>blue</Att3>");
					pw.println("<Att4>blue</Att4>");
					pw.println("<Att5>blue</Att5>");
					pw.println("<Att6>blue</Att6>");
					pw.println("<Att7>blue</Att7>");
					pw.println("<Att8>blue</Att8>");
					pw.println("<Att9>blue</Att9>");
					pw.println("<Att10>blue</Att10>");
					pw.println("<Att11>blue</Att11>");
					pw.println("<Att12>blue</Att12>");
					pw.println("<Att13>blue</Att13>");
					pw.println("<Att14>blue</Att14>");
					pw.println("<Att15>blue</Att15>");
					pw.println("<Att16>blue</Att16>");
					pw.println("<Att17>blue</Att17>");
					pw.println("<Att18>blue</Att18>");
					pw.println("<Att19>blue</Att19>");
					pw.println("</Item>");
				}

			}
			pw.println("</Sales>");
			pw.flush();
			fw.flush();
			pw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {

		new sales().writeFile("txt", 500000);
		new sales().writeFile("xml", 500000);

	}

}
