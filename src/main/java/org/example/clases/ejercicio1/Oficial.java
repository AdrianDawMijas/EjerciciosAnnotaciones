package org.example.clases.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Clase que representa a un oficial, un nivel superior al operario.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Oficial extends Operario {
    private String categoria;    // Categoría del oficial (e.g., Junior, Senior).
}
