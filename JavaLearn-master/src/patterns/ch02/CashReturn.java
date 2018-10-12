package patterns.ch02;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 09:35
 * Modified By:
 * Description:
 */
public class CashReturn extends CashNormal {
    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
