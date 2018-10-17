package genericityTest;


/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/17 16:26
 * Modified By:
 * Description: 一个通用的Generator
 */
public class BasicGenerator<T> implements Generator<T>{
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    //创建类型实例
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}
