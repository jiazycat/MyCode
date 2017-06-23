package xslt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class sqlResult {
	boolean lock=false;
    public boolean setLock(boolean lock) {
    	if (this.lock==lock){
		return false;
		}{ this.lock=lock;
			return true;
		}
		
	}
	public int getEndflag() {
		return endflag;
	}

	int endflag=0;
	String driverName="oracle.jdbc.driver.OracleDriver";  
    String url="jdbc:oracle:thin:@10.86.1.36:1521:fmorcl"; 
    String user="fmuser_jzy";   
    String password="fm";  
    ResultSet rs=null;
    Connection conn = null; 
	public void getStr(){
	
	try {
		Class.forName(driverName);
		conn = DriverManager.getConnection(url, user, password);
		Statement st = conn.createStatement();
		rs = st.executeQuery("select a,b from test01");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}       
	
	}
	public List<String> res(){
	
    List<String> list=new ArrayList<String> ();
    
    try {
	
		for (int i=0;i<1000;i++){
				if(rs!=null&&rs.next()){
					list.add(rs.getString("a")+","+rs.getString("b"));
				}else{
					endflag=1;
					System.out.println(endflag);
					break;
				}
		}
	}  catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;}
	  public static void main(String[] args) {

      }
}
