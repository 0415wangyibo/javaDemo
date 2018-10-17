package exceptionTest;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/16 9:09
 * Modified By:
 * Description:要注意异常的捕获，可能会出现一个catch语句无法捕捉两种异常的情形
 * 注意：catch中也能嵌套try-catch语句
 */
public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        LostMessage lm = new LostMessage();
        System.out.println("第一种方式捕获异常：");
        try {
            try {
                lm.f();
                //如果注释掉下面的catch语句则不会抛出重要异常，即lm.f()的异常
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("第二种方式捕获异常：");
        try {
            lm.f();
            lm.dispose();
            //只能捕获到第一个异常
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("第三种方式捕获异常：");
        try{
            try{
                lm.f();
            }finally {
                lm.dispose();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
