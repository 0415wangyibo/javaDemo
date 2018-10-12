/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/11 9:18
 * Modified By:
 * Description:
 */
public class Test03 {
    final static String salutation = "Hello! ";

    public static void main(String args[]){
        GreetingService greetService1 = message ->
                System.out.println(salutation + message);
        greetService1.sayMessage("Runoob");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
