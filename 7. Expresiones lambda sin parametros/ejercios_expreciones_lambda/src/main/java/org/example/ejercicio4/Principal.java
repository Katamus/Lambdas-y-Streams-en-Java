package org.example.ejercicio4;

public class Principal {

    public static void main(String[] args) {
        CalculadoraInt calI = (x,y)-> x + y;
        CalculadoraLong calL = (x,y)-> x + y;
        engine((CalculadoraLong)( x,  y)-> x + y);
    }

    public static void engine(CalculadoraInt cal){

    }

    public static void engine(CalculadoraLong cal){

    }

}
