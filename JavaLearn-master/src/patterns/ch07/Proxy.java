package patterns.ch07;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 14:58
 * Modified By:
 * Description:
 */
public class Proxy implements GiveGift {
    private Pursuit gg;

    public Proxy() {
    }

    Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }


    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
