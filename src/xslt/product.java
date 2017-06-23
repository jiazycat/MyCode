package xslt;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class product {

	public void writeFile(String filename, int lop) {
		try {
			FileWriter fw = null;
			File f = new File("D:/xml/fmwin/Product." + filename);
			fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);

			pw.println("<Product>");
			for (int i = 0; i < lop; i++) {
				if (filename == "txt") {
					pw.print("P111,");
					pw.print("desc,");
					pw.print("short_desc,");
					pw.print("G11,");
					pw.print("P112,");
					pw.print("1.000,");
					pw.print("valueUnit,");
					pw.print("10,");
					pw.print("abc,");
					pw.print("10,");
					pw.print("abc,");
					pw.print("10,");
					pw.print("abc,");
					pw.print("10,");
					pw.print("abc,");
					pw.print("10,");
					pw.print("abc,");
					pw.print("UM1,");
					pw.print("2,");
					pw.print("UM2,");
					pw.print("2,");
					pw.print("UM3,");
					pw.print("2,");
					pw.print("UM4,");
					pw.print("2,");
					pw.print("UM5,");
					pw.print("2,");
					pw.print("UM6,");
					pw.print("2,");
					pw.print("UM7,");
					pw.print("2,");
					pw.print("UM8,");
					pw.print("2,");
					pw.print("UM9,");
					pw.print("2,");
					pw.print("UM10,");
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
					pw.println("red");
				} else if (filename == "xml") {

					pw.println("<Item>");
					pw.println("<Key>P111</Key>");
					pw.println("<Des>desc</Des>");
					pw.println("<ShortDes>short_desc</ShortDes>");
					pw.println("<Owner>G11</Owner>");
					pw.println("<ConKey>P112</ConKey>");
					pw.println("<SubFactor>1.000</SubFactor>");
					pw.println("<Currency>valueUnit</Currency>");
					pw.println("<Price1>10</Price1>");
					pw.println("<ProdCoef1>abc</ProdCoef1>");
					pw.println("<Price2>10</Price2>");
					pw.println("<ProdCoef2>abc</ProdCoef2>");
					pw.println("<Price3>10</Price3>");
					pw.println("<ProdCoef3>abc</ProdCoef3>");
					pw.println("<Price4>10</Price4>");
					pw.println("<ProdCoef4>abc</ProdCoef4>");
					pw.println("<Price5>10</Price5>");
					pw.println("<ProdCoef5>abc</ProdCoef5>");
					pw.println("<Uom1>UM1</Uom1>");
					pw.println("<Ratio2>2</Ratio2>");
					pw.println("<Uom2>UM2</Uom2>");
					pw.println("<Ratio3>2</Ratio3>");
					pw.println("<Uom3>UM3</Uom3>");
					pw.println("<Ratio4>2</Ratio4>");
					pw.println("<Uom4>UM4</Uom4>");
					pw.println("<Ratio5>2</Ratio5>");
					pw.println("<Uom5>UM5</Uom5>");
					pw.println("<Ratio6>2</Ratio6>");
					pw.println("<Uom6>UM6</Uom6>");
					pw.println("<Ratio7>2</Ratio7>");
					pw.println("<Uom7>UM7</Uom7>");
					pw.println("<Ratio8>2</Ratio8>");
					pw.println("<Uom8>UM8</Uom8>");
					pw.println("<Ratio9>2</Ratio9>");
					pw.println("<Uom9>UM9</Uom9>");
					pw.println("<Ratio10>2</Ratio10>");
					pw.println("<Uom10>UM10</Uom10>");
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
			pw.println("</Product>");
			pw.flush();
			fw.flush();
			pw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {

		new product().writeFile("txt", 500000);
		new product().writeFile("xml", 500000);

	}

}
