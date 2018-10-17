package genericityTest;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/17 16:41
 * Modified By:
 * Description:
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject "+id;
    }
}
