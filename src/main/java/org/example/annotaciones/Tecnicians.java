package org.example.annotaciones;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Tecnicians{
    Tecnician[] value();

}
