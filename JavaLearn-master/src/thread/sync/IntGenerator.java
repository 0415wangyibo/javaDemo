package thread.sync;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/23 09:01
 * Modified By:
 * Description:
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }

}
