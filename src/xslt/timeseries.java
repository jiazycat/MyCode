package xslt;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class timeseries {
	public void writeFile(String filename, int lop) {
		try {
			FileWriter fw = null;
			File f = new File("D:/xml/fmwin/TimeSeries." + filename);
			fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);

			pw.println("<TimeSeries>");
			for (int i = 0; i < lop; i++) {

				if (filename == "txt") {
					pw.print("P111,");
					pw.print("P111,");
					pw.print("P111,");
					pw.print("P111,");
					pw.print("P111,");
					pw.print("P111,");
					pw.print("201506,");
					pw.println("11111,");
				} else if (filename == "xml") {
					pw.print("<Node ");
					pw.print("Key=\"P111-P111-P111-P111-P111\" ");
					pw.print("Fam=\"P111\" ");
					pw.print("Geo=\"P111\" ");
					pw.print("Dis=\"P111\" ");
					pw.print("Dim4=\"P111\" ");
					pw.print("Dim5=\"P111\">");
					pw.println("<Values LastPeriod=\"201506\">");
					pw.println("<Value index=\"0\">11111</Value>");
					pw.println("</Values>");
					pw.println("</Node>");
				}

			}
			pw.println("</TimeSeries>");
			pw.flush();
			fw.flush();
			pw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {

		new timeseries().writeFile("txt", 1);
		new timeseries().writeFile("xml", 1);

	}
}
