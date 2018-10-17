package Scanner;

import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/17 10:52
 * Modified By:
 * Description:将字符串按照指定需求分隔成新的字符串
 *             注：pattern中的（）是用来进行分组的，只有这样才能取出合适的分组内容
 */
public class ThreatAnalyzer {
    static String threatData =
            "58.27.82.161@02/10/2005\n" +
                    "204.45.234.40@02/11/2005\n" +
                    "58.27.82.162@02/12/2005\n" +
                    "[Next log section with different data format]";
    public static void main(String[] args){
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@" +
                "(\\d{2}/\\d{2}/\\d{4})";
        while (scanner.hasNext(pattern)) {
            scanner.next(pattern);
            MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.format("Threat on %s form %s\n", date, ip);
        }
    }
}
