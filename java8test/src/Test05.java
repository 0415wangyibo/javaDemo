import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/11 9:34
 * Modified By:
 * Description:
 */
public class Test05 {
    public static void main(String args[]){
        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }
}
