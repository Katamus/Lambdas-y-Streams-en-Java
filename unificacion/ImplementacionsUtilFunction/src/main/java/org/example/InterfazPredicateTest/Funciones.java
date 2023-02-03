package org.example.InterfazPredicateTest;

import java.util.function.BiFunction;

public class Funciones {
    public double incrementoSalario(Empleado empleado, double incremento, BiFunction<Double,Double,Double> bi){
        return bi.apply(empleado.getSalario(),incremento);
    }
}
