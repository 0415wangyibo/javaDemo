package annotation;

import java.lang.annotation.*;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/5 09:53
 * Modified By:
 * Description:
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ReqUrl {
    String reqUrl() default "";
}
