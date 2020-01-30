package jobkorea;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainApp {

	private static String URL = "http://www.jobkorea.co.kr/Search/?";
	
	public static void main(String[] args) throws IOException {
		String KEY_WORD="jquery";
		//1. Document를 가져온다.
		Document doc=Jsoup.connect(URL+getParameter(KEY_WORD, 2)).get();
		//2. 목록을 가져온다.
		//System.out.println(URL+getParameter(KEY_WORD, 2));
		//System.out.println(""+doc.toString());
		//div class="list-default"  ul class="clear"여기의 li를 다가져온다.
		Elements elements = doc.select(".lists .lists-cnt .list-default .clear li");
		
		//3.목록(배열)에서 정보를 가져온다.
		int idx=0;
		for(Element element:elements)
		{
			//System.out.println(++idx+":"+element.toString());
			System.out.println(++idx+":"+element.text());
			System.out.println("=======================================================================================================================================================");
		}
		 
	}
	
	
	public static String getParameter(String KEY_WORD, int PAGE) {
		String params = "stext="+KEY_WORD+""+"&Page_No="+PAGE+"";
		return params;
	}
}
