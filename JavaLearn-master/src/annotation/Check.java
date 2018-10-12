package annotation;

import java.lang.annotation.*;

/**
 * Created by 71579 on 2018/6/4.
 */
@Documented
@Target(ElementType.CONSTRUCTOR)
public @interface Check {
    String value();
}
