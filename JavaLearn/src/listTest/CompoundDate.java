package listTest;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/15 16:39
 * Modified By:
 * Description:
 */
public class CompoundDate {
    private Integer order1;
    private Integer order2;
    private Integer order3;
    private String name;

    public Integer getOrder1() {
        return order1;
    }

    public void setOrder1(Integer order1) {
        this.order1 = order1;
    }

    public Integer getOrder2() {
        return order2;
    }

    public void setOrder2(Integer order2) {
        this.order2 = order2;
    }

    public Integer getOrder3() {
        return order3;
    }

    public void setOrder3(Integer order3) {
        this.order3 = order3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompoundDate(Integer order1, Integer order2, Integer order3, String name) {
        this.order1 = order1;
        this.order2 = order2;
        this.order3 = order3;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CompoundDate{" +
                "order1=" + order1 +
                ", order2=" + order2 +
                ", order3=" + order3 +
                ", name='" + name + '\'' +
                '}';
    }
}
