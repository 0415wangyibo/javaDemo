package genericityTest;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/17 16:03
 * Modified By:
 * Description:泛型方法
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(" ");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f(1L);
        gm.f('c');
        gm.f(gm);
    }
}
