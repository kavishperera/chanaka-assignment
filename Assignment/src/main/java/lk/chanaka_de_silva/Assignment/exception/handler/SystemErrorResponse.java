package lk.kavishmanjitha.machine_issues_traking.v1.exception.handler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface SystemErrorResponse {
    public int value();

    public String reason() default "";
}
