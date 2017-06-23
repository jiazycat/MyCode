package xslt;

public class Pexport{
	
	public void pexportdata(){
		
		pexportThread thr1=new pexportThread("1 and 2224996","1.txt");
		pexportThread thr2=new pexportThread("2224997 and 4449992","2.txt");
		pexportThread thr3=new pexportThread("4449993 and 6674988","3.txt");
		pexportThread thr4=new pexportThread("6674989 and 8899984","4.txt");
		pexportThread thr5=new pexportThread("8899985 and 11124980","5.txt");
		pexportThread thr6=new pexportThread("11124981 and 13349976","6.txt");
		pexportThread thr7=new pexportThread("13349977 and 15574972","7.txt");
		pexportThread thr8=new pexportThread("15574973 and 17799975","8.txt");
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
		  new Pexport().pexportdata();
	  }
}