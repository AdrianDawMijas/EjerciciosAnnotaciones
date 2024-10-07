package org.example.ejercicio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.annotaciones.*;
import org.example.clases.ejercicio1.Directivo;
import org.example.clases.ejercicio1.Empleado;
import org.example.clases.ejercicio1.Oficial;
import org.example.clases.ejercicio1.Tecnico;

import java.util.ArrayList;
import java.util.List;

// Definición de empleados con anotaciones personalizadas.
@Director(
        nombre = "Paco",
        apellido = "GarciaGonzalez",
        dni = "25742444",
        direccion = "Mi casa",
        telefono = 1222222,
        codigoDespacho = 2
)
@Tecnician(
        nombre = "Paco2",
        apellido = "GarciaGonzalez",
        dni = "25742444",
        direccion = "Mi casa",
        telefono = 1222222,
        codigoTaller = 3,
        perfil = "Delado"
)
@Oficialn(
        nombre = "Paco3",
        apellido = "GarciaGonzalez",
        dni = "25742444",
        direccion = "Mi casa",
        telefono = 1222222,
        codigoTaller = 3,
        categoria = "Mucha"
)

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empresa2 {
    // Lista que almacena todos los empleados de la empresa.
    private List<Empleado> listaEmpleados = new ArrayList<>();

    /**
     * Carga el contexto de la empresa a partir de las anotaciones `@Director`, `@Tecnician`
     * y `@Oficialn` presentes en la clase. Crea objetos `Empleado` correspondientes y
     * los añade a la lista de empleados.
     *
     * @return Una instancia de `Empresa2` con los empleados cargados.
     */
    public static Empresa2 cargadorDeContexto() {
        // Obtener todas las anotaciones presentes en la clase.
        Director[] directors = Empresa2.class.getAnnotationsByType(Director.class);
        Tecnician[] tecnicians = Empresa2.class.getAnnotationsByType(Tecnician.class);
        Oficialn[] oficials = Empresa2.class.getAnnotationsByType(Oficialn.class);

        // Crear una lista que contenga todas las anotaciones.
        List<Object> employees = new ArrayList<>();
        employees.addAll(List.of(directors));
        employees.addAll(List.of(tecnicians));
        employees.addAll(List.of(oficials));

        // Crear una instancia de `Empresa2` y obtener la lista de empleados.
        Empresa2 empresa = new Empresa2();
        List<Empleado> listaEmpleadosFinal = empresa.getListaEmpleados();

        // Iterar sobre las anotaciones y crear instancias de empleados en base a su tipo.
        for (Object empleado : employees) {
            if (empleado instanceof Director) {
                // Crear una instancia de Directivo y asignar valores de la anotación.
                Directivo directivo = new Directivo();
                directivo.setCodigoDespacho(((Director) empleado).codigoDespacho());
                directivo.setNombre(((Director) empleado).nombre());
                directivo.setApellido(((Director) empleado).apellido());
                directivo.setDireccion(((Director) empleado).direccion());
                directivo.setDNI(((Director) empleado).dni());
                directivo.setTelefono(((Director) empleado).telefono());
                listaEmpleadosFinal.add(directivo);
            } else if (empleado instanceof Tecnician) {
                // Crear una instancia de Tecnico y asignar valores de la anotación.
                Tecnico tecnico = new Tecnico();
                tecnico.setPerfil(((Tecnician) empleado).perfil());
                tecnico.setNombre(((Tecnician) empleado).nombre());
                tecnico.setApellido(((Tecnician) empleado).apellido());
                tecnico.setDireccion(((Tecnician) empleado).direccion());
                tecnico.setDNI(((Tecnician) empleado).dni());
                tecnico.setTelefono(((Tecnician) empleado).telefono());
                listaEmpleadosFinal.add(tecnico);
            } else if (empleado instanceof Oficialn) {
                // Crear una instancia de Oficial y asignar valores de la anotación.
                Oficial oficial = new Oficial();
                oficial.setCategoria(((Oficialn) empleado).categoria());
                oficial.setNombre(((Oficialn) empleado).nombre());
                oficial.setApellido(((Oficialn) empleado).apellido());
                oficial.setDireccion(((Oficialn) empleado).direccion());
                oficial.setDNI(((Oficialn) empleado).dni());
                oficial.setTelefono(((Oficialn) empleado).telefono());
                listaEmpleadosFinal.add(oficial);
            }
        }

        // Retornar la instancia de `Empresa2` con todos los empleados cargados.
        return empresa;
    }
}
