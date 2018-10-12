package crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/22 15:35
 * Modified By:
 * Description:
 */
public class Fii {
    String host = "http://www.jjxsw.com";

    public static void main(String[] args) {
//        String html = "<html><head><title>First parse</title></head>"
//                + "<body><p>Parsed HTML into a doc.</p></body></html>";
//        Document doc = Jsoup.parse(html);
//        String title = doc.title();
//        System.out.println(title);

        try {
            Document content = Jsoup.connect("http://www.jjxsw.com/txt/12778.htm").get();
            Elements elements = content.getElementsByAttributeValue("class", "downAddress_li");

            String html = elements.html();
            content = Jsoup.parse(html);
            elements = content.getElementsByTag("a");
            String downloadLink = elements.attr("href");
            System.out.println(downloadLink);

            content = Jsoup.connect("http://www.jjxsw.com" + downloadLink).get();
            Element element = content.getElementById("Frame");
            elements = element.getElementsByTag("a");
            System.out.println(elements.get(elements.size() - 1).attr("href"));
            System.out.println(elements.get(elements.size() - 2).attr("href"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCate() {
        try {

            Document content = Jsoup.connect(host + "/txt/Chuanyue/index_214.html").get();
            Element element = content.getElementById("catalog");
            System.out.println(element.hasText());
            Elements links = element.getElementsByTag("a");
            Elements imgs = element.getElementsByTag("img");

            System.out.println(links + "  " + imgs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testBrowser() {
        if (java.awt.Desktop.isDesktopSupported()) {
            try {
                // 创建一个URI实例
                java.net.URI uri = java.net.URI.create("http://www.jjxsw.com/e/DownSys/doaction.php?enews=DownSoft&classid=47&id=17415&pathid=0&pass=ee247a67a5adcf1dfb1abecbd1ff5635&p=:::");
                // 获取当前系统桌面扩展
                java.awt.Desktop dp = java.awt.Desktop.getDesktop();
                // 判断系统桌面是否支持要执行的功能
                if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
                    // 获取系统默认浏览器打开链接
                    dp.browse(uri);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void closeBrowse() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
//            Runtime.getRuntime().exec("taskkill /F /IM iexplorer.exe");
//            Runtime.getRuntime().exec("taskkill /F /IM 360se.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


