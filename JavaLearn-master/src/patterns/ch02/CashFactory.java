package patterns.ch02;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 09:37
 * Modified By:
 * Description:
 */
public class CashFactory {
    public static AbstractCash createCashAccept(String type) {
        AbstractCash cash = null;

        switch (type) {
            case "1":
                cash = new CashNormal();
                break;
            case "2":
                cash = new CashRebate(0.8);
                break;
            case "3":
                cash = new CashReturn(300, 100);
                break;
            default:
                break;
        }

        return cash;
    }
}
