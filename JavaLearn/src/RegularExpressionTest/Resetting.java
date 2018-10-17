package RegularExpressionTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/17 10:13
 * Modified By:
 * Description:
 */
public class Resetting {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
        while (m.find()) {
            System.out.print(m.group()+" ");
        }
        System.out.println();
        m.reset("fix the rig with rags");
        while (m.find()) {
            System.out.print(m.group()+" ");
        }
    }
}
