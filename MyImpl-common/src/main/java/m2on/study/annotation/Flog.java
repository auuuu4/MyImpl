package m2on.study.annotation;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * @Author: HuLiang
 * @Date: 2024/07/13/14:47
 * @Description: File Log Annotation
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface Flog {

    String service () default "Unnamed";
    String logDir () default ".";

}
