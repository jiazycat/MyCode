package xslt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pexportThread extends Thread {

	String str;
	String str1;
	public pexportThread(String str,String str1) {
		this.str = str;
		this.str1=str1;
	}

	public void run() {
		try {
			FileWriter fw = null;
			PrintWriter pw;
			
			String driverName = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@10.86.1.36:1521:fmorcl";
			String user = "fmuser_jzy";
			String password = "fm";
			ResultSet rs = null;
			Connection conn = null;
			int i = 0;
			File f = new File("D:/xml/"+str1);
			fw = new FileWriter(f, true);
			pw = new PrintWriter(fw);
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, user, password);
			Statement st = conn.createStatement();
	
			rs = st.executeQuery(
					"select a,b,c from (select a,b,c,rownum ro from TESTT) where ro between "
							+ str);
			rs.setFetchSize(50000);
			if (rs != null) {
				while (rs.next()) {
					pw.println(rs.getString("a") + "," + rs.getString("b") + "," + rs.getString("c"));
					i = i + 1;
					if (i == 1000000) {
						i = 1;
						pw.flush();
						fw.flush();
					}
				}
			}
			if (rs != null) {
				rs.close();
			}

			if (conn != null) {
				conn.close();
			}
			fw.flush();
			pw.close();
			fw.close();
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
