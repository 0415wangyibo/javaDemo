/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/11 9:39
 * Modified By:
 * Description:
 */
public class Car implements Vehicle,FourWheeler{
    private String name;

    @Override
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("我是一辆汽车!");
    }

    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }
    public Car(){
        this.name = "福田";
    }

    public String getCarName(){
        return this.name;
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
}
