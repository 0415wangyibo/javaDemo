package patterns.ch09;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 15:56
 * Modified By:
 * Description:
 */
public abstract class AbstractPrototype {
    private String id;

    public AbstractPrototype() {
    }

    public AbstractPrototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public abstract AbstractPrototype clone();
}
