package xslt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class txttoxml {
	int i = 0;
	public void readFile() {
		FileWriter fw = null;
		try {
			File f = new File("D:/xml/a.xml");
			fw = new FileWriter(f, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fw);
		try {
			FileReader fr = new FileReader("D:/xml/output.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			pw.println("<FMWin>");
			while (s != null) {
				String[] str = s.split(",");
				for (int i = 0; i < str.length; i++) {
					switch (i) {
					case 0:
						pw.println("<First>" + str[i] + "</First>");
						break;
					case 1:
						pw.println("<last>" + str[i] + "</last>");
						break;
					case 2:
						pw.println("<pho>" + str[i] + "</pho>");
						break;
					case 3:
						pw.println("<mail>" + str[i] + "</mail>");
						break;
					}
				}
				if (i % 10000 == 0) {
					pw.flush();
				}
				try {
					if (i == 100000) {
						fw.flush();
						i = 0;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				s = br.readLine();
				i = i + 1;
			}
			br.close();
			pw.println("</FMWin>");
			pw.flush();
			fw.flush();
			pw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		new txttoxml().readFile();
		Date now1 = new Date();
		System.out.println(now1);
	}

}
