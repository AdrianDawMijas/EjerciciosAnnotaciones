package org.example.annotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Tecnicians.class)
public @interface Tecnician {
    String nombre();
    String apellido();
    String dni();
    String direccion();
    int telefono();
    int codigoTaller();
    String perfil();

}