package org.example.operacionesFilter;

import org.example.pojo.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class OperacionesFilter {

    public static void main(String[] args) {
        List<Empleado> empleados = Empleado.empleados();
        System.out.println("Empleados hombres");
        empleados.stream().filter(new Predicate<Empleado>() {
            @Override
            public boolean test(Empleado empleado) {
                return empleado.esHombre();
            }
        }).forEach(empleado-> {
            System.out.println(" Nombre del empleado: "+empleado.getNombre()+ " - Genero: "+empleado.getGenero());
        });
    }
}
