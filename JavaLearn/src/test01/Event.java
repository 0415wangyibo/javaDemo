package test01;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/15 10:26
 * Modified By:
 * Description:
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        System.out.println("eventTime:" + eventTime);
        System.out.println("nanoTime:" + System.nanoTime());
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
