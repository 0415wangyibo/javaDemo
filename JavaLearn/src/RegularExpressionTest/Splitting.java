package RegularExpressionTest;

import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/16 11:06
 * Modified By:
 * Description:split方法将字符串进行分隔
 */
public class Splitting {
    public static String knights = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest..." +
            "with ... a herring!";
    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }
    public static void main(String[] args){
        System.out.println("以空格分隔：");
        split(" ");
        System.out.println("非单词字符");
        split("\\W+");
        System.out.println("以字母n结尾的非单词字符");
        split("n\\W+");
    }
}
