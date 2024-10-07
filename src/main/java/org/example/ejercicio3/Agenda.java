package org.example.ejercicio3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.annotaciones.Tarea;

import java.util.ArrayList;
import java.util.List;

// Definimos múltiples tareas utilizando la anotación personalizada @Tarea.
@Tarea(
        diaSemana = "Lunes",
        hora = "09:00 AM",
        descripcion = "Reunión con el equipo",
        titulo = "Reunión semanal"
)
@Tarea(
        diaSemana = "Martes",
        hora = "11:00 AM",
        descripcion = "Desarrollo de proyecto",
        titulo = "Proyecto X"
)
@Tarea(
        diaSemana = "Miércoles",
        hora = "02:00 PM",
        descripcion = "Revisión de código",
        titulo = "Code Review"
)

// Lombok se utiliza para generar constructores, getters y setters
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agenda {
    // Lista que almacena las tareas de la agenda.
    private List<TareaAgenda> listaTareas = new ArrayList<>();

    /**
     * Método estático que carga el contexto de la clase `Agenda`
     * usando las anotaciones `@Tarea` y convierte esas anotaciones
     * en instancias de la clase `TareaAgenda`.
     *
     * @return una instancia de `Agenda` con las tareas cargadas.
     */
    public static Agenda cargadorDeContexto() {
        // Obtener todas las anotaciones de tipo @Tarea presentes en la clase.
        Tarea[] tareas = Agenda.class.getAnnotationsByType(Tarea.class);

        // Crear una nueva instancia de la agenda.
        Agenda agenda = new Agenda();
        List<TareaAgenda> lista = agenda.getListaTareas();

        // Convertir cada anotación @Tarea en un objeto `TareaAgenda`.
        for (Tarea tarea : tareas) {
            TareaAgenda tareaAgenda = new TareaAgenda();
            tareaAgenda.setTitulo(tarea.titulo());
            tareaAgenda.setDescripcion(tarea.descripcion());
            tareaAgenda.setDiaSemana(tarea.diaSemana());
            tareaAgenda.setHora(tarea.hora());
            lista.add(tareaAgenda);
        }
        return agenda;
    }
}
