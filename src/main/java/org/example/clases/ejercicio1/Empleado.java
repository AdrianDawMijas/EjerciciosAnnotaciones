package org.example.clases.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase base para todos los tipos de empleados en la empresa.
 */
@Data
@NoArgsConstructor
public class Empleado {
    private String nombre;
    private String apellido;
    private String direccion;
    private String DNI;
    private int telefono;
    /**
     * Constructor básico con los campos obligatorios.
     *
     * @param nombre    Nombre del empleado
     * @param apellido  Apellido del empleado
     * @param direccion Dirección del empleado
     * @param DNI       Documento de identidad del empleado
     * @param telefono  Teléfono del empleado
     */
    public Empleado(String nombre, String apellido, String direccion, String DNI, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.telefono = telefono;
    }
}
