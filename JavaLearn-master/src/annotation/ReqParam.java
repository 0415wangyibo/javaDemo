package annotation;

import java.lang.annotation.*;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/5 09:54
 * Modified By:
 * Description:
 */
@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ReqParam {
    String value();
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface ReqParams {
    ReqParam[] value();
}
