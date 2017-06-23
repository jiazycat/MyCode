package xslt;

public class createfile {

	public static void main(String[] args) {
        int i,j;
        i=1;
        j=1000000;
		/*new product().writeFile("txt", i);
		new product().writeFile("xml", i);
		new sales().writeFile("txt", i);
		new sales().writeFile("xml", i);
		new trade().writeFile("txt", i);
		new trade().writeFile("xml", i);
		new dim().writeFile("txt", i);
		new dim().writeFile("xml", i);
		new timeseries().writeFile("txt", j);
		new timeseries().writeFile("xml", j);
		new planning().writeFile("txt", j);
		new planning().writeFile("xml", j);*/
		new forecast().writeFile("txt", j);
		new forecast().writeFile("xml", j);
		/*new forecasetnotmtotal().writeFile("txt", j);
		new forecasetnotmtotal().writeFile("xml", j);
		new WeekPlanning().writeFile("txt", j);
		new WeekPlanning().writeFile("xml", j);
		new weekforcastnot().writeFile("txt",j);
		new weekforcastnot().writeFile("xml",j);*/
		new weekforcast().writeFile("txt",j);
		new weekforcast().writeFile("xml",j);

	}
}
