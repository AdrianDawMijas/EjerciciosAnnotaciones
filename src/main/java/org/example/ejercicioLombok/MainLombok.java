package org.example.ejercicioLombok;

public class MainLombok {
    public static void main(String[] args) {
        // Ejemplo de creación de un objeto usando el constructor. Los campos anotados con @NonNull no pueden ser nulos.
        Persona persona1 = new Persona("Paco", 10, 100, 100, "Male");
        System.out.println("Objeto creado con el constructor:");
        System.out.println(persona1);

        // Ejemplo de creación de un objeto usando el Builder. Notar que no se está especificando todos los campos.
        Persona persona2 = Persona.builder().age(10).name("Paco").build();
        System.out.println("\nObjeto creado con el Builder:");
        System.out.println(persona2);

        // Intento de modificar un campo de la persona (esto no es posible porque la clase es inmutable).
        // persona1.setAge(20); // Esto generaría un error de compilación debido a la inmutabilidad.

        // Ejemplo de inmutabilidad: intentamos cambiar el nombre, pero la clase no tiene setters, por lo que no se puede modificar.
        System.out.println("\nIntento de modificar campos (no se puede hacer debido a la inmutabilidad):");
        // Descomentar la siguiente línea dará error porque no hay un método setName.
        // persona1.setName("Juan"); // Error: no se puede hacer porque la clase es inmutable.

        // Comparación de objetos con equals() generado por Lombok
        Persona persona3 = new Persona("Paco", 10, 100, 100, "Male");
        System.out.println("\nComparación entre persona1 y persona3 usando equals(): " + persona1.equals(persona3));

        // Comparación de hash codes
        System.out.println("Comparación de hash codes entre persona1 y persona3: " + (persona1.hashCode() == persona3.hashCode()));

        // ToString automático
        System.out.println("\nResultado de toString() para persona1:");
        System.out.println(persona1.toString());

        // Intento de asignar un campo nulo (esto lanzará una NullPointerException)
        try {
            Persona persona4 = new Persona(null, 15, 150, 45, "Female");
        } catch (NullPointerException e) {
            System.out.println("\nNo se pudo crear persona4 debido a un campo nulo en @NonNull:");
            e.printStackTrace();
        }
    }
}
