package test;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/23 11:01
 * Modified By:
 * Description:
 */
public class FileUploadTest {
    public static void main(String[] args) {

    }

    @Test
    public void testStrSeperate() {
        String name = "1323.1.1.rmvb";
        int index = name.lastIndexOf(".");
        System.out.println(index);
        String format = name.substring(index + 1, name.length());
        System.out.println(format);
    }

    @Test
    public void match() {
        Pattern NUMBER_PATTERN = Pattern.compile("[\\u4e00\\u4e8c\\u4e09\\u56db\\u4e94\\u516d\\u4e03\\u516b\\u4e5d\\u5341]+|\\d+");
        String s = "第2集  第02集  第15集 第二集  第二十集  第三十八集";
        // 第2集  第02集  第15集
        // 第二集  第二十集  第三十八集
        Matcher m = NUMBER_PATTERN.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
