package org.example.InterfaceBiConsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        String[][] arreglo = {{"Chris","Usa"},{"Raju","India"},{"Lynda","Canada"}};

        for(int i = 0; i < arreglo.length; i++){
            map.put(arreglo[i][0],arreglo[i][1]);
        }
        System.out.println("Usando la forma tradicional" + " Clave y valor de un map");

        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
        if(iter != null ){
            while (iter.hasNext()){
                Map.Entry<String,String> entry = iter.next();
                System.out.println("Clave: "+ entry.getKey()+ "\t"+"valor: "+ entry.getValue());
            }
        }

        System.out.println("Usando biconsumer la forma tradicional" + " Clave y valor de un map");
        map.forEach((key,value)->{
            System.out.println("Clave: "+ key+ "\t"+"valor: "+ value);
        });
    }

}
