package org.example.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculadora2 {

    public List<Double> calc(BiFunction<Double,Double,Double> bi, List<Empleado> listaEmpleado, Double incremento){

        List<Double> listaSalarios = new ArrayList<>();

        for (Empleado empleado :
        listaEmpleado) {
            listaSalarios.add(bi.apply(empleado.getSalario(),incremento));
        }
        return listaSalarios;
    }


}
