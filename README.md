Proyecto de Ejercicios con Anotaciones y Lombok

Este proyecto contiene diversos ejercicios organizados en diferentes clases y paquetes. Cada ejercicio aborda conceptos de programación como el uso de anotaciones personalizadas, la creación de clases utilizando Lombok, y la gestión de empleados y tareas en una agenda. A continuación se presenta una breve descripción de cada ejercicio.
Ejercicio 1: Empresa (Paquete ejercicio1)

Este ejercicio define una estructura de empresa con diferentes tipos de empleados (Directivo, Técnico, Oficial, y Operario). Los empleados se crean a partir de anotaciones personalizadas y se almacenan en una lista dentro de la clase Empresa.
Características:

    Uso de la anotación @Employee para definir diferentes empleados.
    Clase Empresa que carga empleados desde las anotaciones y los organiza en una lista.
    Diferentes tipos de empleados (Directivo, Técnico, Oficial) con sus respectivas propiedades.

Ejercicio 2: Empresa2 (Paquete ejercicio2)

Extensión del Ejercicio 1 con una clase Empresa2 que también carga empleados, pero utilizando otras anotaciones como @Director, @Tecnician, y @Oficialn. Esta clase se utiliza para demostrar cómo manejar múltiples anotaciones y organizarlas en una estructura unificada.
Características:

    Uso de múltiples anotaciones (@Director, @Tecnician, @Oficialn).
    Clase Empresa2 que agrupa todos los empleados según sus roles definidos en las anotaciones.
    Organización jerárquica de los empleados en la lista.

Ejercicio 3: Agenda (Paquete ejercicio3)

Este ejercicio implementa una clase Agenda que gestiona tareas utilizando anotaciones personalizadas (@Tarea). Las tareas se definen directamente en la clase Agenda y se cargan dinámicamente en una lista para ser gestionadas.
Características:

    Uso de la anotación @Tarea para definir tareas con propiedades como día de la semana, hora, descripción y título.
    Clase Agenda que carga las tareas desde las anotaciones y permite su visualización.
    Estructura orientada a la gestión de tareas y planificación.

Ejercicio 4: Uso de Lombok (Paquete ejercicioLombok)

Ejercicio que muestra el uso de Lombok para simplificar la creación de clases como Persona, que se utiliza para demostrar cómo se generan automáticamente métodos como getters, setters, y constructores.
Características:

    Uso de anotaciones de Lombok como @Data, @Builder, @Value, y @NonNull.
    Clase Persona que implementa las características de inmutabilidad y validación de campos con @NonNull.
    Ejemplo de Main para crear y mostrar instancias de Persona.
