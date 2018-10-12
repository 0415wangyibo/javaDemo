package patterns.ch07;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 15:02
 * Modified By:
 * Description:
 */
public class Ch07 {
    public static void main(String[] args) {
        SchoolGirl jiayi = new SchoolGirl();
        jiayi.setName("佳仪");

        Proxy daili = new Proxy(jiayi);

        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
