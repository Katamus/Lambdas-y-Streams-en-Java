package org.example;

public class Main {
    public static void main(String[] args) {
        FuncionTest ft = ()->System.out.println("Hola Mundo");
        ft.saludar();

        Main main = new Main();
        main.miMetodo(ft);
    }

    public void miMetodo(FuncionTest ft){
        ft.saludar();
    }
}