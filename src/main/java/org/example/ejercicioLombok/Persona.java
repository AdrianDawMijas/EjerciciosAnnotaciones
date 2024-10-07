package org.example.ejercicioLombok;

import lombok.*;

// La anotación @Data crea automáticamente getters, setters, toString, equals, y hashCode
@Data
// La anotación @Builder permite construir la clase usando el patrón Builder
@Builder
// La anotación @Value hace que la clase sea inmutable
@Value
// La anotación @NonNull obliga a que los campos no puedan ser nulos
public class Persona {
    @NonNull String name; // Campo que no puede ser nulo
    int age;              // Edad de la persona
    int height;           // Altura en cm
    int weight;           // Peso en kg
    String gender;        // Género de la persona

    // No se crean setters porque la clase es inmutable gracias a @Value
}
