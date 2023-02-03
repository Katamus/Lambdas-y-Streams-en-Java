package org.example.InterfaceConsumer.estudiantes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class principal {

    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Jhon",6),
                new Estudiante("Mark",5),
                new Estudiante("Felix",5),
                new Estudiante("Patrick",6),
                new Estudiante("James",3),
                new Estudiante("Pater",10),
                new Estudiante("Mathew",10),
                new Estudiante("Paul",9),
                new Estudiante("James",5),
                new Estudiante("Judas",4),
                new Estudiante("Tomas",8),
                new Estudiante("Felipe",7),
                new Estudiante("Tom",6),
                new Estudiante("Maria",7)
        );

        OperacionEstudiantes op = new OperacionEstudiantes();

        /*
        Consumer<Estudiante> cons1 = estudiante -> System.out.println("Nombre : "+ estudiante.getNombre()+ " Calificacion: "+ estudiante.getCalificacion());

        System.out.println("Estudiantes sin calificacion actualizada");
        op.aceptaTodos(estudiantes,cons1);

        Consumer<Estudiante> cons2 = estudiante -> estudiante.setCalificacion(estudiante.getCalificacion()*1.15);
        op.aceptaTodos(estudiantes,cons2);

        System.out.println("\nEstudiantes con calificacion actualizada");
        op.aceptaTodos(estudiantes,cons1);
         */
        Consumer<Estudiante> cons1 = estudiante -> System.out.println("Nombre : "+ estudiante.getNombre()+ " Calificacion: "+ estudiante.getCalificacion());

        System.out.println("Estudiantes sin calificacion actualizada");
        op.aceptaTodos(estudiantes,cons1);

        Consumer<Estudiante> cons2 = estudiante -> estudiante.setCalificacion(estudiante.getCalificacion()*1.15);
        Consumer<Estudiante> cons3 = cons2.andThen(cons1);

        System.out.println("\nEstudiantes con calificacion actualizada");
        op.aceptaTodos(estudiantes,cons3);
    }

}
