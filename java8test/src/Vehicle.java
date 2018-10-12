/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/11 10:36
 * Modified By:
 * Description:
 */
public interface Vehicle {
    default void print(){
        System.out.println("我是一辆车!");
    }

    static void blowHorn(){
        System.out.println("按喇叭!!!");
    }
}
