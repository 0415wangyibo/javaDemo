package shape;

import java.util.Arrays;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/25 14:21
 * Modified By:
 * Description:
 */
public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );

        shapes.forEach(System.out::println);
    }
}
