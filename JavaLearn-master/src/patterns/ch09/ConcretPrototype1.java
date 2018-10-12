package patterns.ch09;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 15:57
 * Modified By:
 * Description:
 */
public class ConcretPrototype1 extends AbstractPrototype {
    public ConcretPrototype1(String id) {
        super(id);
    }

    @Override
    public AbstractPrototype clone() {
        return this;
    }
}
