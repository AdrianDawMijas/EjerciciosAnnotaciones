package org.example.clases.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Clase que representa a un operario de la empresa.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Operario extends Empleado {
    private int codigoTaller;    // Código del taller asignado al operario.
}
