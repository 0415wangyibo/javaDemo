package RegularExpressionTest;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/16 10:57
 * Modified By:
 * Description:正则表达式
 */
public class IntegerMatch {
    public static void main(String[] args){
        //只能以-开头，后接若干数字
        System.out.println("-123".matches("-\\d+"));
        //以-或者空开头
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        //以+或者-或者空开头
        System.out.println("+9141".matches("(-|\\+)?\\d+"));
    }
}
