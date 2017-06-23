package xslt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
	String FileName;

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	FileWriter fw = null;
	PrintWriter pw;

	public void openFile() {

		try {
			// 如果文件存在，则追加内容；如果文件不存在，则创建文件
			File f = new File(FileName);
			fw = new FileWriter(f, true);
			pw = new PrintWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setValue(String value) {
		pw.println(value);
	}

	public void pflush() {
		pw.flush();
	}

	public void fflush() throws IOException {
		fw.flush();
	}

	public void close() throws IOException {
		pw.close();
		fw.close();
	}
}
