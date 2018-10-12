package patterns.ch02;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 09:33
 * Modified By:
 * Description:
 */
public class CashNormal extends AbstractCash {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
