package org.example.ejercicio3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok se utiliza para generar constructores, getters y setters.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TareaAgenda {
    private String titulo;       // Título de la tarea.
    private String descripcion;  // Descripción de la tarea.
    private String diaSemana;    // Día de la semana en que se realiza la tarea.
    private String hora;         // Hora en que se realiza la tarea.
}
