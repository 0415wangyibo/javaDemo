package iterator;

import java.util.ArrayList;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/30 09:50
 * Modified By:
 * Description:
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator gen, int quantity) {
        return new CollectionData<T>(gen, quantity);
    }
}
