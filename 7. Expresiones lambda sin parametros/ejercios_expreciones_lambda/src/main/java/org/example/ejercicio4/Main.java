package org.example.ejercicio4;

public class Main {

    public static void main(String[] args) {
        System.out.println(create().calculate(2,2));
    }

    private static CalculadoraLong create(){
        long var = 201;
        // long x = 2; esto genera error por que ya esta declarada la variable x
        // ya que aunque sea un metodo abstracto de una interfas comparte el mismo ambito o this o scope
        return (x,y) -> x / y + var;
    }
}
