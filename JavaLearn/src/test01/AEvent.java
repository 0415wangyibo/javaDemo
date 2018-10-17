package test01;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/15 10:42
 * Modified By:
 * Description:
 */
public class AEvent extends Event {
    public AEvent(long delayTime) {
        super(delayTime);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public boolean ready() {
        return super.ready();
    }

    @Override
    public void action() {
        System.out.println("AEvent.action:你好");
    }
}
