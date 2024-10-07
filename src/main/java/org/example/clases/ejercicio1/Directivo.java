package org.example.clases.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Clase que representa a un directivo de la empresa.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Directivo extends Empleado {
    private int codigoDespacho;  // Código de despacho del directivo.
}
