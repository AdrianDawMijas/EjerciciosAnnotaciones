package org.example.annotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Directors.class)
public @interface Director {
    String nombre();
    String apellido();
    String dni();
    int telefono();
    String direccion();
    int codigoDespacho();
}
