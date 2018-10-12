package thread;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/20 14:43
 * Modified By:
 * Description:
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for launch");
    }
}
