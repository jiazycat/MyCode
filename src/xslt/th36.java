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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class th36 extends Thread{

	
	List<String> list = new LinkedList<String>();
	public th36(List<String> list) {
		this.list=list;
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
			File f = new File("D:/xml/test.txt");
			fw = new FileWriter(f, true);
			pw = new PrintWriter(fw);
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, user, password);
			Statement st = conn.createStatement();
			for (int i = 0; i < list.size(); i++) {
				//System.out.println(list.get(i));
				rs = st.executeQuery("select a,b,c from testt where a="+list.get(i));
				rs.setFetchSize(50000);
				if (rs != null) {
					while (rs.next()) {
						pw.println(rs.getString("a") + "," + rs.getString("b")+ "," + rs.getString("c"));
						pw.flush();
					}
				}
			}
			
			if(rs != null){  
                rs.close();  
            }  
          
            if(conn != null){  
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
