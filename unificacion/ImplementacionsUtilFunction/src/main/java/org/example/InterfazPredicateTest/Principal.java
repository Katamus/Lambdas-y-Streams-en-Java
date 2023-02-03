package org.example.InterfazPredicateTest;

import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Rodrigo",25,1500,"Cobranzas"),
                new Empleado("Rodrigo",25,1500,"Cobranzas"),
                new Empleado("Lidia",21,600,"Cobranzas"),
                new Empleado("Eleazar",33,600,"Cobranzas"),
                new Empleado("Javier",35,600,"Cobranzas"),
                new Empleado("Paola",50,1500,"Cobranzas"),
                new Empleado("Ignacio",41,1500,"Cobranzas"),
                new Empleado("Rodrigo",40,7000,"Cobranzas")
        );

        Evaluador evaluador = new Evaluador();

        System.out.println("Empleados con salarios > 5000");
        List<Empleado> empSalariosAltos = evaluador.evaluar(listaEmpleados,
                (empleado) -> empleado.getSalario() > 5000
                );

        for (Empleado empleado :empSalariosAltos ) {
            System.out.println(empleado.getSalario());
        }

        System.out.println("Empleados que su nombre inicia con J: ");

        List<Empleado> empIniNomJ = evaluador.evaluar(listaEmpleados,empleado -> empleado.getNombre().startsWith("J"));

        for (Empleado empleado :empIniNomJ ) {
            System.out.println(empleado.getNombre());
        }

        List<Empleado> empjove = evaluador.evaluar(listaEmpleados,empleado -> empleado.getEdad() < 25);
        System.out.println("Empleados Jovenes : ");
        for (Empleado empleado :empIniNomJ ) {
            System.out.println(empleado.getNombre());
        }

        Funciones funciones = new Funciones();
        for (Empleado empleado: empjove) {
            double nuevosalario = funciones.incrementoSalario(
                    empleado,
                    10,
                    (salario,incremento)-> salario +  (salario * (incremento/10))
                    );
            empleado.setSalario(nuevosalario);
        }
        System.out.println("Salarios actualizado en los jovenes ");
        for (Empleado empleado: empjove) {
            System.out.println("Nombre: "+empleado.getNombre() +
                    " Salario: "+ empleado.getSalario());
        }

        List<Empleado> empjoMayo = evaluador.evaluarAlContrario(listaEmpleados,empleado -> empleado.getEdad() < 25);
        System.out.println("Empleados Mayores : ");
        for (Empleado empleado :empjoMayo ) {
            System.out.println(empleado.getNombre());
        }
    }

}
