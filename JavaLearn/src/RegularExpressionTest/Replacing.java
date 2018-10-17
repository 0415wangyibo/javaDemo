package RegularExpressionTest;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/16 14:34
 * Modified By:
 * Description:
 */
public class Replacing {
    static String s = Splitting.knights;
    public static void main(String[] args){
        System.out.println(s.replaceFirst("f\\w+","located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring","banana"));
    }
}
