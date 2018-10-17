/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/15 9:24
 * Modified By:
 * Description:
 */
public class MultiImplementation {
    static void takesD(D d){
        d.hello();
    }
    static void takesE(E e){
        e.saySomething();
    }
    public static void main(String[] args){
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}
