package xslt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;  
import java.net.URL;

  
  
public class HtmlRequest {  

	    private String u;
	    private String encoding;
	    private String filename;
	    public static void main(String[] args) throws Exception {
	    	new HtmlRequest("http://www.postgres.cn/docs/9.6/sql.html", "utf-8","E:/test/a.html").run();
	    }
	    public HtmlRequest(String u, String encoding,String filename) {
	        this.u = u;
	        this.encoding = encoding;
	        this.filename=filename;
	    }
	    public void run() throws Exception {
	        URL url = new URL(u);
	        HttpURLConnection urlConnection = (HttpURLConnection) url
	                .openConnection();
	        BufferedReader reader = new BufferedReader(new InputStreamReader(
	                urlConnection.getInputStream(), encoding));
	        String line=""; 
	        String text="";
	        while ((line = reader.readLine()) != null) {
	        	text=text+" "+line;
	        }
	        //System.out.println(text);
	        new writeHtml().Write(text, filename);
	    }
}