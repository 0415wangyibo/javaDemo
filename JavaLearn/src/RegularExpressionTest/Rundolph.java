package RegularExpressionTest;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/16 14:45
 * Modified By:
 * Description:注：\s——空白符 （空格、tab、换行、换页、回车）
 *                 \S——非空白符([^\s])
 *                 \d——数字[0-9]
 *                 \D——非数字[^0-9]
 *                 \w——词字符[a-zA-Z0-9]
 *                 \W——非词字符[^\w]
 *                 XY——Y跟在X后面
 *                 X|Y——X或Y
 *                 (X)——捕获组
 *                 \b——词的边界
 *                 \B——非词的边界
 */
public class Rundolph {
    public static void main(String[] args) {
        for (String pattern:new String[]{
                "Rudolph","[rR]udolph","[rR][aeiou][a-z]ol.*","R.*"
        }){
            System.out.println("Rudolph".matches(pattern));
        }
        //判断图片名是否匹配一定的命名规范
        System.out.println("125X255.png".matches("\\d+[xX]\\d+[.](png|gif|jpg|jpeg|PNG|GIF|JPG|JPEG)"));
        //判断图片类型是否符合要求
        System.out.println("png".matches("(png|gif|jpg|jpeg|PNG|GIF|JPG|JPEG)"));
    }
}
