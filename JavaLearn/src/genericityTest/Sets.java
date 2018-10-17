package genericityTest;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/17 17:00
 * Modified By:
 * Description: 泛型求交、并、差
 */
public class Sets {
    //并集
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    //交集
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    //差集
    public static <T> Set<T> difference(Set<T> superSet, Set<T> subSet) {
        Set<T> result = new HashSet<>(superSet);
        result.removeAll(subSet);
        return result;
    }

    //并集减交集
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}
