package xslt;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class writeHtml {	
	public void Write(String text,String filename) throws IOException{
		/*File file=new File(filename);
		if (!file.exists()){

			FileWriter fw = null;
			try {
				fw = new FileWriter(file, true);
				PrintWriter pw = new PrintWriter(fw);
				pw.print(text);
				pw.flush();
				fw.flush();
				pw.close();
				fw.close();
			} catch (IOException e) {			
				e.printStackTrace();
			}
		}*/
		FileOutputStream fos = new FileOutputStream(filename);   
	       OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");   
	       osw.write(text);   
	       osw.flush(); 
	       osw.close();
	       fos.close();
	}
}
