package xslt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writeXML {
	
	public void Wxml(String TargetFile, String[] str) {
		FileWriter fw = null;
		try {
			// 如果文件存在，则追加内容；如果文件不存在，则创建文件
			File f = new File(TargetFile);
			fw = new FileWriter(f, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fw);
		for (int i=0;i<str.length;i++){
			switch(i) {  
		    case 0: pw.println("<First>"+str[i]+"</First>"); break;
		    case 1: pw.println("<last>"+str[i]+"</last>"); break;
		    case 2: pw.println("<pho>"+str[i]+"</pho>"); break;
		    case 3: pw.println("<mail>"+str[i]+"</mail>");  break;
		}  
       
		}
		pw.flush();
		try {
			fw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
