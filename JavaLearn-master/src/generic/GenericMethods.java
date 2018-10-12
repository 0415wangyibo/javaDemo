package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/21 16:06
 * Modified By:
 * Description:
 */
public class GenericMethods {
    public <M, N, T> void f(M m, N n, T... x) {
        System.out.println(m.getClass().getName() + "  "
                + n.getClass().getName());
        for (T t : x) {
            System.out.println(t.getClass().getName());
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("123");
        stringList.addAll(new ArrayList<>());
        GenericMethods gm = new GenericMethods();
        gm.f("", 123, 123.90, "1213");
        gm.f(gm, gm, gm, 123);
    }
}
