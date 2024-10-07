package org.example.clases.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.annotaciones.Employee;

import java.util.ArrayList;
import java.util.List;

// Definición de empleados con la anotación personalizada @Employee.
@Employee(
        nombre = "Paco",
        apellido = "GarciaGonzalez",
        dni = "25742444",
        direccion = "Mi casa",
        telefono = 1222222,
        clase = "Directivo",
        codigoDespacho = 2
)
@Employee(
        nombre = "Paco2",
        apellido = "GarciaGonzalez",
        dni = "25742444",
        direccion = "Mi casa",
        telefono = 1222222,
        clase = "Tecnico",
        codigoTaller = 3,
        perfil = "Delado"
)
@Employee(
        nombre = "Paco3",
        apellido = "GarciaGonzalez",
        dni = "25742444",
        direccion = "Mi casa",
        telefono = 1222222,
        clase = "Oficial",
        codigoTaller = 3,
        categoria = "Mucha"
)

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {
    // Lista de empleados en la empresa.
    private List<Empleado> listaEmpleados = new ArrayList<>();

    /**
     * Método getter para obtener la lista de empleados.
     *
     * @return Lista de empleados de la empresa.
     */
    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * Método que carga el contexto de la empresa a partir de las anotaciones `@Employee`
     * presentes en la clase. Crea objetos de tipo `Empleado` en función de la clase
     * especificada en la anotación y los añade a la lista de empleados.
     *
     * @return Instancia de `Empresa` con los empleados cargados.
     */
    public static Empresa cargadorDeContexto() {
        // Obtener todas las anotaciones de tipo @Employee presentes en la clase Empresa.
        Employee[] employers = Empresa.class.getAnnotationsByType(Employee.class);
        Empresa empresa = new Empresa();
        List<Empleado> listaEmpleadosFinal = empresa.getListaEmpleados();

        // Iterar sobre cada anotación @Employee y crear el tipo de empleado correspondiente.
        for (Employee employer : employers) {
            switch (employer.clase()) {
                case "Directivo":
                    Directivo directivo = new Directivo();
                    directivo.setCodigoDespacho(employer.codigoDespacho());
                    directivo.setNombre(employer.nombre());
                    directivo.setApellido(employer.apellido());
                    directivo.setDireccion(employer.direccion());
                    directivo.setDNI(employer.dni());
                    directivo.setTelefono(employer.telefono());
                    listaEmpleadosFinal.add(directivo);
                    break;

                case "Tecnico":
                    Tecnico tecnico = new Tecnico();
                    tecnico.setPerfil(employer.perfil());
                    tecnico.setNombre(employer.nombre());
                    tecnico.setApellido(employer.apellido());
                    tecnico.setDireccion(employer.direccion());
                    tecnico.setDNI(employer.dni());
                    tecnico.setTelefono(employer.telefono());
                    listaEmpleadosFinal.add(tecnico);
                    break;

                case "Oficial":
                    Oficial oficial = new Oficial();
                    oficial.setCategoria(employer.categoria());
                    oficial.setNombre(employer.nombre());
                    oficial.setApellido(employer.apellido());
                    oficial.setDireccion(employer.direccion());
                    oficial.setDNI(employer.dni());
                    oficial.setTelefono(employer.telefono());
                    listaEmpleadosFinal.add(oficial);
                    break;

                default:
                    System.out.println("Clase no reconocida: " + employer.clase());
                    break;
            }
        }
        return empresa;
    }
}
