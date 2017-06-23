package xslt;

import java.util.List;


public class ppp {
    public void p(String file) throws Exception{
    	List<String> list=new GetURL().getURL("http://www.postgres.cn/docs/9.6/"+file, "utf-8");
    	new HtmlRequest("http://www.postgres.cn/docs/9.6/"+file, "utf-8","E:/test/"+file).run();

		for (int i = 0; i < list.size(); i++) {
			new ppp().p(list.get(i));	
			System.out.println(list.get(i));
			}
    }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new ppp().p("index.html");
		//new HtmlRequest("http://www.postgres.cn/docs/9.6/sql.html", "utf-8","E:/test/a.html").run();
	}

}
