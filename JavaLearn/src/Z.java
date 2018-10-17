/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/15 9:20
 * Modified By:
 * Description:
 */
public class Z extends D {
    E makeE(){
        return new E() {
            @Override
            public void saySomething() {
                System.out.println("E:你好！");
            }
        };
    }
}
