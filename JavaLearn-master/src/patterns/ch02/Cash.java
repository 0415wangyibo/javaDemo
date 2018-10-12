package patterns.ch02;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 09:40
 * Modified By:
 * Description:
 */
public class Cash {
    public static void main(String[] args) {
        AbstractCash cash = CashFactory.createCashAccept("1");
        System.out.println(cash.acceptCash(365));
    }
}
