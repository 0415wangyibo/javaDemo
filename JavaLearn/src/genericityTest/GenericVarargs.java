package genericityTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/17 16:14
 * Modified By:
 * Description:可变参数与泛型方法
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }
    public static void main(String[] args){
        List<String> list = makeList("A");
        System.out.println(list);
        list = makeList("A", "B", "C");
        System.out.println(list);
        list=makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(list);
    }
}
