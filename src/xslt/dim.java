package xslt;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class dim {
	public void writeFile(String filename, int lop) {
		try {
			FileWriter fw = null;
			File f = new File("D:/xml/fmwin/Dim." + filename);
			fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);

			pw.println("<Dim>");
			for (int i = 0; i < lop; i++) {

				if (filename == "txt") {
					pw.print("P111,");
					pw.print("desc,");
					pw.print("short_desc,");
					pw.print("G11,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.print("red,");
					pw.println("red,");
				} else if (filename == "xml") {
					pw.println("<Item>");

					pw.println("<Key>P111</Key>");
					pw.println("<Des>desc</Des>");
					pw.println("<ShortDes>short_desc</ShortDes>");
					pw.println("<Owner>G11</Owner>");
					pw.println("<Att1>red</Att1>");
					pw.println("<Att2>red</Att2>");
					pw.println("<Att3>red</Att3>");
					pw.println("<Att4>red</Att4>");
					pw.println("<Att5>red</Att5>");
					pw.println("<Att6>red</Att6>");
					pw.println("<Att7>red</Att7>");
					pw.println("<Att8>red</Att8>");
					pw.println("<Att9>red</Att9>");
					pw.println("<Att10>red</Att10>");
					pw.println("<Att11>red</Att11>");
					pw.println("<Att12>red</Att12>");
					pw.println("<Att13>red</Att13>");
					pw.println("<Att14>red</Att14>");
					pw.println("<Att15>red</Att15>");
					pw.println("<Att16>red</Att16>");
					pw.println("<Att17>red</Att17>");
					pw.println("<Att18>red</Att18>");
					pw.println("<Att19>red</Att19>");
					pw.println("</Item>");
				}

			}
			pw.println("</Dim>");
			pw.flush();
			fw.flush();
			pw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {

		new dim().writeFile("txt", 500000);
		new dim().writeFile("xml", 500000);

	}
}
