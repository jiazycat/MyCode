package xslt;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;
import org.htmlparser.visitors.HtmlPage;
public class GetURL {
	public List<String> getURL(String url,String ENCODE) throws ParserException{
		List<String> list =  new LinkedList<String>();;
		org.htmlparser.http.ConnectionManager manager = org.htmlparser.lexer.Page.getConnectionManager(); 
		Parser parser = new Parser(manager.openConnection(url));  
		 parser.setEncoding(ENCODE); 
		 HtmlPage page = new HtmlPage(parser);   
	        try {   
	            parser.visitAllNodesWith(page);   
	        } catch (ParserException e1) {   
	           e1 = null;   
	        }   
	       
	        NodeList nodelist = page.getBody();   
	        NodeFilter filter = new TagNameFilter("a");   
	        nodelist = nodelist.extractAllNodesThatMatch(filter, true);   
	       for (int i = 0; i < nodelist.size(); i++) {  
	            LinkTag link = (LinkTag) nodelist.elementAt(i);   
	            if (link.getAttribute("href")!=null&&!new File("E:/test/"+link.getAttribute("href")).exists()&&!Pattern.matches("http([\\d\\D])*",link.getAttribute("href"))&&!Pattern.matches("ftp([\\d\\D])*",link.getAttribute("href"))){
	            	list.add(link.getAttribute("href"));
	            }   
	        }   
	       return list;
		
	}
	public static void main(String[] args) throws Exception {
		/*List<String> list=new GetURL().getURL("http://www.postgres.cn/docs/9.6/index.html", "UTF-8");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));			
			}*/
		if(!Pattern.matches("ftp([\\d\\D])*","ftp:asdasd")){
			System.out.println(1);
		}
		
	}

}
