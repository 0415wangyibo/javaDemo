package iterator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/30 09:59
 * Modified By:
 * Description:
 */
class Government implements Generator<String> {

    String[] foundation = ("strange woman lying in ponds " +
            "distributing swords is no basis for a system of government").split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(
                new CollectionData<>(new Government(), 15)
        );

        set.addAll(CollectionData.list(new Government(), 15));

        System.out.println(set);
    }
}
