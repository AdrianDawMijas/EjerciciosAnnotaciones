package org.example.annotaciones;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Tareas.class)

public @interface Tarea {
    String titulo() default "Mi:libro";
    String descripcion() default "Mi:libro";
    String diaSemana();
    String hora();
}
