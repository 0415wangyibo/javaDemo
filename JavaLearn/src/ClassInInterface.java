/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/12 17:35
 * Modified By:
 * Description:接口中可以定义内部类，可以添加main方法并运行
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{
        @Override
        public void howdy() {
            System.out.println("Howdy");
        }
        public static void main(String arg[]){
            new Test().howdy();
        }
    }
}
