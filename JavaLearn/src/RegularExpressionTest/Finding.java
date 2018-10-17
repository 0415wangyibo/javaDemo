package RegularExpressionTest;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/17 9:04
 * Modified By:
 * Description:
 */
public class Finding {
    public static void main(String[] args){
        String input = "Evening is full of the linnet's wings";
        Matcher m = Pattern.compile("\\w+").matcher(input);
        while (m.find()){
            System.out.print(m.group()+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(Pattern.compile(" ").split(input)));
        System.out.println(Arrays.toString(Pattern.compile(" ").split(input,5)));
    }
}
