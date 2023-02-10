package org.example.operacionesSorted;

import org.example.pojo.Empleado;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OperacionSorted {

    public static void main(String[] args) {
        System.out.println("Nombres ordenados: ");
        Arrays.asList("Alfredo","Maria","Daniel","Brenda")
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Números ordenados: ");
        Arrays.asList(1,2,7,8,9,1,5,2,1,5,3,5)
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Empleados ordenados por nombre alfabéticamente: ");
        List<Empleado> empleados = Empleado.empleados();
        empleados.stream()
                .sorted()
                .forEach((empleado -> System.out.println(empleado.getNombre())));

        System.out.println("\nEmpleados ordenados por edad: ");
        empleados.stream().sorted(new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return o1.getEdad() - o2.getEdad();
            }
        }).forEach(empleado -> {
            System.out.println(empleado.getNombre()+" "+empleado.getEdad());
        });

        System.out.println("\nEmpleados ordenados por salario: ");
        empleados.stream()
        .filter(empleado -> empleado.getEdad() > 25)
        .sorted((o1, o2) -> (int) (o1.getIngresos() - o2.getIngresos()))
        .forEach(empleado -> {
            System.out.println(empleado.getNombre()+" "+empleado.getIngresos());
        });

    }

}
