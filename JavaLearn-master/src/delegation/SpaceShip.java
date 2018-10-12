package delegation;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/17 16:18
 * Modified By:
 * Description:
 */
public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("CZ Protector");

        protector.forward(100);

        protector.su(1);
    }

    public void su(float i) {
        System.out.println("float");
    }

    static final class A{

    }
}
