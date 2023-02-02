package org.example.funciones;

import org.example.pojos.Comensal;

import java.util.function.Function;

public class DatosComesal {

    public static void main(String[] args) {
        Comensal com1 = new Comensal("Javier", 256.2, 5);
        String nombreCom = (String ) getDatoComensal(com1, x -> x.getNombre());
        int mesa = (int ) getDatoComensal(com1, x -> x.getMesa());
        System.out.println("El nombre del comensal es: "+nombreCom);
        System.out.println("La mesa del comensal es: "+mesa);
    }

    public static Object getDatoComensal(
            Comensal com,
            Function<Comensal,Object> func
    ){
        return func.apply(com);
    }

}
