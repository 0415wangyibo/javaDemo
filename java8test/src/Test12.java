import java.time.ZonedDateTime;
import java.time.ZoneId;
/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/11 12:00
 * Modified By:
 * Description:
 */
public class Test12 {
    public static void main(String args[]){
        Test12 java8tester = new Test12();
        java8tester.testZonedDateTime();
    }

    public void testZonedDateTime(){

        // 获取当前时间日期
//        ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        ZonedDateTime date1 = ZonedDateTime.now();
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("当前时区: " + currentZone);
    }
}
