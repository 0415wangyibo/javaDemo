package RegularExpressionTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/17 9:47
 * Modified By:
 * Description:appendReplacement结合appendTail可以实现按照一定规则替换字符串，并得到替换后的字符串
 */
public class TheReplacements {
    public static void main(String[] args) {
        String s = "Here's a block of text to  user   as input to the regular expression matcher. Note that we'll" +
                " first extract the block of text by looking for the special delimiters, then process the extracted block.";
        s = s.replaceAll(" {2,}", " ");
        System.out.println(s);
        s = s.replaceFirst("[aeiou]", "(Vowel1)");
        System.out.println(s);
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        while (m.find()) {
            m.appendReplacement(sbuf, m.group().toUpperCase());
        }
        m.appendTail(sbuf);
        System.out.println(sbuf);
    }
}
