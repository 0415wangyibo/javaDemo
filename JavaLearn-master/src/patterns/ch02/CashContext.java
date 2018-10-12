package patterns.ch02;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 10:10
 * Modified By:
 * Description:
 */
public class CashContext {
    private AbstractCash cash;

    public CashContext(AbstractCash cash) {
        this.cash = cash;
    }

    public double getResult(double money) {
        return cash.acceptCash(money);
    }
}
