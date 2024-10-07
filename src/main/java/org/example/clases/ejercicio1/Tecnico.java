package org.example.clases.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Clase que representa a un técnico de la empresa.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tecnico extends Operario {
    private String perfil;       // Perfil técnico del empleado (e.g., Mantenimiento, Desarrollo).
}
