package org.example.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EjercicioNew {

    public static void main(String[] args) {
        List<String> numeros =
                Arrays.asList("10","10","15","15","25","30","40","6","30");

        getResults(numeros, Integer::new).forEach(EjercicioNew::multiplicarPor10);
    }

    public static List<Integer> getResults(List<String> datos, Function<String,Integer> function){
        List<Integer> resultados = new ArrayList<>();
        datos.forEach(strNum-> resultados.add(function.apply(strNum)));
        return resultados;
    }

    public static void multiplicarPor10(int numero){
        System.out.println("El nuevo valor del dator "+numero+" es: "+numero*10);
    }

}
