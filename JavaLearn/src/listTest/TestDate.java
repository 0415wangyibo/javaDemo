package listTest;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/15 15:44
 * Modified By:
 * Description:
 */
public class TestDate {

    private Integer order;
    private String name;

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestDate(Integer order, String name) {
        this.order = order;
        this.name = name;
    }

    public void sayHello(){
        System.out.println("我的名字是"+name+"，我的优先级是："+this.order);
    }

    @Override
    public String toString() {
        return "TestDate{" +
                "order=" + order +
                ", name='" + name + '\'' +
                '}';
    }
}
