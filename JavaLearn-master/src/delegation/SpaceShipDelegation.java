package delegation;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/17 16:16
 * Modified By:
 * Description:
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void back(int velocity) {
        controls.back(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("CZ Protector");
        protector.forward(100);
    }

}
