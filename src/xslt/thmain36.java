package xslt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class thmain36 {
public void pexportdata(){
	String driverName = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@10.86.1.36:1521:fmorcl";
	String user = "fmuser_jzy";
	String password = "fm";
	int i=0;
	List<String> list1 = new LinkedList<String>();
	List<String> list2 = new LinkedList<String>();
	List<String> list3 = new LinkedList<String>();
	List<String> list4 = new LinkedList<String>();
	List<String> list5 = new LinkedList<String>();
	List<String> list6 = new LinkedList<String>();
	List<String> list7 = new LinkedList<String>();
	List<String> list8 = new LinkedList<String>();
	try {
		Class.forName(driverName);
		ResultSet rs = null;
		Connection conn = null;
		conn = DriverManager.getConnection(url, user, password);
		Statement st = conn.createStatement();
		rs = st.executeQuery("select distinct a from testt" );
		rs.setFetchSize(50000);
		while(rs.next()){
			switch(i%8) {
			case 0:list1.add(rs.getString("a"));i=1 ;break;
			case 1:list2.add(rs.getString("a"));i=2 ;break;
			case 2:list3.add(rs.getString("a"));i=3 ;break;
			case 3:list4.add(rs.getString("a"));i=4 ;break;
			case 4:list5.add(rs.getString("a"));i=5 ;break;
			case 5:list6.add(rs.getString("a"));i=6 ;break;
			case 6:list7.add(rs.getString("a"));i=7 ;break;
			case 7:list8.add(rs.getString("a"));i=0 ;break;
			}	
		}
		if(rs != null){  
            rs.close();  
        }  
      
        if(conn != null){  
            conn.close();  
        } 
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	th36 thr1=new th36(list1);
	th36 thr2=new th36(list2);
	th36 thr3=new th36(list3);
	th36 thr4=new th36(list4);
	th36 thr5=new th36(list5);
	th36 thr6=new th36(list6);
	th36 thr7=new th36(list7);
	th36 thr8=new th36(list8);
	
	    thr1.start();
		thr2.start();
		thr3.start();
		thr4.start();
		thr5.start();
		thr6.start();
		thr7.start();
		thr8.start();
		
	}
	  public static void main(String[] args) {
		  new thmain36().pexportdata();

	  }
}
