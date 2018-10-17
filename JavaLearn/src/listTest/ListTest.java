package listTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/15 15:09
 * Modified By:
 * Description:LinkedList本身就是实现了Queue，因此可以将LinkedList向上转型为Queue
 */
public class ListTest {
    public static void printQ(Queue queue) {
        while (null != queue.peek()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(45);
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(i + 10));
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for (char c : "wangyb".toCharArray()) {
            qc.add(c);
        }
        printQ(qc);
    }

}
