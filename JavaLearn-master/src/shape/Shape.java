package shape;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/25 14:18
 * Modified By:
 * Description:
 */
public abstract class Shape {
    void draw(){
        System.out.println(this + ".draw()");
    }

    @Override
    abstract public String toString();
}
