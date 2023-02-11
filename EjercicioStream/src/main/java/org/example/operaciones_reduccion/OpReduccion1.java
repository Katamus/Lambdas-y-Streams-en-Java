package org.example.operaciones_reduccion;

import org.example.pojo.Empleado;

import java.util.*;
import java.util.stream.Collectors;

public class OpReduccion1 {

    public static void main(String[] args) {
       /* List<String> nombres = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll
                );*/

        /*
        Set<String> nombres = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toSet());

        System.out.println("Lista de nombres");


         */

        SortedSet<String> nombres = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toCollection(TreeSet::new) );

        System.out.println("Lista de nombres");
        nombres.forEach(System.out::println);
    }

}
