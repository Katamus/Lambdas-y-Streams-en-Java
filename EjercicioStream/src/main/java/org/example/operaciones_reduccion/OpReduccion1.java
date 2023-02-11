package org.example.operaciones_reduccion;

import org.example.pojo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class OpReduccion1 {

    public static void main(String[] args) {
        List<String> nombres = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll
                );

        System.out.println("Lista de nombres");
        nombres.forEach(System.out::println);
    }

}
