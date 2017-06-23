package xslt;

import java.io.BufferedReader;
import java.io.FileReader;

public class Mmain  {
		  

	    public void thmain()  throws Exception {  
	    	
	    	FileReader fr = new FileReader("D:/xml/output.txt");
			BufferedReader br = new BufferedReader(fr);
			MThread mTh1=new MThread(br);  
	    	MThread mTh2=new MThread(br);  
	    	MThread mTh3=new MThread(br); 
	    	MThread mTh4=new MThread(br); 
	    	MThread mTh5=new MThread(br); 
	    	MThread mTh6=new MThread(br); 
	    	MThread mTh7=new MThread(br); 
	    	MThread mTh8=new MThread(br); 
	        mTh1.start();  
	        mTh2.start(); 
	        mTh3.start(); 
	        mTh4.start(); 
	        mTh5.start(); 
	        mTh6.start(); 
	        mTh7.start(); 
	        mTh8.start(); 
	 }  
	    public static void main(String[] args) {
			try {
				new Mmain().thmain();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
