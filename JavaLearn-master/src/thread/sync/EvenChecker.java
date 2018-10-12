package thread.sync;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/23 09:05
 * Modified By:
 * Description:
 */
public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private int id;

    public EvenChecker(){}

    public EvenChecker(IntGenerator generator, int id) {
        this.generator = generator;
        this.id = id;
    }


    @Override
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + " not even!");
                generator.cancel();
            }
        }
    }

    public static void test(IntGenerator generator, int count) {
        System.out.println("Press Ctrl+C to exit!");
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            executorService.execute(new EvenChecker(generator, count));
        }
        executorService.shutdown();
    }

    public static void test(IntGenerator generator) {
        test(generator, 10);
    }
}
