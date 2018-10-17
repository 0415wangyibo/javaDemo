package genericityTest;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/17 16:44
 * Modified By:
 * Description:
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i=0;i<5;i++) {
            System.out.println(gen.next());
        }
    }
}
