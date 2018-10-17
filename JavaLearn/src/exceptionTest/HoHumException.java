package exceptionTest;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/16 9:01
 * Modified By:
 * Description:
 */
public class HoHumException extends Exception {
    @Override
    public String toString() {
        return "不重要的异常";
    }
}
