package xslt;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MThread extends Thread {
	private BufferedReader input;  
    public MThread(BufferedReader input) {  
       this.input=input;  
    }  
    public void run() {  
       
    	String driverName="oracle.jdbc.driver.OracleDriver";  
        String url="jdbc:oracle:thin:@10.86.1.36:1521:fmorcl"; 
        String user="fmuser_jzy";   
        String password="fm";  
        
       
        
        ResultSet rs = null;  
        Connection conn = null;  
        
        try {  
            Class.forName(driverName);       
            conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
            String str;
            PreparedStatement InsertStmt=conn.prepareStatement("insert into test01 values (:1,:2)");
            int batchSize=100;
            int i=1;
            
            while ((str = input.readLine())!= null)  {  
                if (0 != str.length()) {  
            	String[] strv = str.split(",");
            	InsertStmt.setString(1, strv[0]);
            	InsertStmt.setString(2, strv[1]);
            	InsertStmt.addBatch();
            	i=i+1;
            	if(i%batchSize==0){
            		InsertStmt.executeBatch();
            		i=1;
            	}
            	InsertStmt.executeBatch();
                /*String sql="insert into test01 values ("+strv[0]+",'"+strv[1]+"')";
                st.execute(sql) ;*/
            }}
            st.execute("commit") ;
            
            
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{  
            try{  
                if(rs != null){  
                    rs.close();  
                }  
              
                if(conn != null){  
                    conn.close();  
                }  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }     
        }  
      
    }  
      
   
    

}
