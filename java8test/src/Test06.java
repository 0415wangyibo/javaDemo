import java.util.Arrays;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/11 9:37
 * Modified By:
 * Description:
 */
public class Test06 {
    public static void main(String args[]){
        final Car car = Car.create( Car::new );
        final List< Car > cars = Arrays.asList( car );
        cars.forEach( Car::collide );
        cars.forEach( Car::repair );
        final Car police = Car.create( Car::new );
        cars.forEach( police::follow );
        cars.forEach(car1 -> {
            System.out.println(car1.getCarName());
        });
    }
}
