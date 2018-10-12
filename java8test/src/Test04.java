/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/11 9:19
 * Modified By:
 * Description:
 */
public class Test04 {
    public static void main(String args[]) {
        final int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);  // 输出结果为 3
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }
}
