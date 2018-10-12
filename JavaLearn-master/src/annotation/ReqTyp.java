package annotation;

import java.lang.annotation.*;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/5 09:50
 * Modified By:
 * Description:
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ReqTyp {
    /**
     * 请求方式枚举
     */
    enum ReqTypeEnum {
        GET, POST, DELETE, PUT
    }

    /**
     * 请求方式
     *
     * @return
     */
    ReqTypeEnum reqType() default ReqTypeEnum.POST;
}
