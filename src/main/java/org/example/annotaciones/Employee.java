package org.example.annotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Employers.class)
public @interface Employee {
    String nombre();
    String apellido();
    String dni();
    String direccion();
    int telefono();
    String clase();
    int codigoDespacho() default 0;
    int codigoTaller() default 0;
    String perfil() default "";
    String categoria() default "";
}
