package org.example;

import org.example.clases.ejercicio1.Empleado;
import org.example.clases.ejercicio1.Empresa;
import org.example.ejercicio2.Empresa2;
import org.example.ejercicio3.Agenda;
import org.example.ejercicio3.TareaAgenda;

public class Main {
    public static void main(String[] args) {
        // Cargar la empresa desde las anotaciones en la clase Empresa.
        Empresa nuevaEmpresa = Empresa.cargadorDeContexto();
        System.out.println("Empleados de la empresa (Empresa):");
        for (Empleado empleado : nuevaEmpresa.getListaEmpleados()) {
            System.out.println(empleado.toString());
        }

        // Separador visual para mejorar la legibilidad en la consola.
        System.out.println("\n----------------------------\n");

        // Cargar la empresa desde las anotaciones en la clase Empresa2.
        Empresa2 nuevaEmpresa2 = Empresa2.cargadorDeContexto();
        System.out.println("Empleados de la empresa (Empresa2):");
        for (Empleado empleado : nuevaEmpresa2.getListaEmpleados()) {
            System.out.println(empleado.toString());
        }

        // Separador visual para mejorar la legibilidad en la consola.
        System.out.println("\n----------------------------\n");

        // Cargar la agenda usando las anotaciones definidas en la clase Agenda.
        Agenda nuevaAgenda = Agenda.cargadorDeContexto();
        System.out.println("Tareas de la agenda:");
        for (TareaAgenda tarea : nuevaAgenda.getListaTareas()) {
            System.out.println(tarea.toString());
        }

        // Separador visual para mejorar la legibilidad en la consola.
        System.out.println("\n----------------------------\n");

        // Información adicional si quieres mostrar objetos Persona, etc.
        // Ejemplo: Persona persona = new Persona("Paco", 10, 100, 100, "Male");
        // System.out.println("Persona creada: " + persona);
    }
}
