package thread.sync;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/23 13:44
 * Modified By:
 * Description:
 */
public class SynchronizedEvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}
