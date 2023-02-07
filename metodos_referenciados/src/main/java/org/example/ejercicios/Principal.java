package org.example.ejercicios;

import org.example.modelo.Persona;
import org.example.utilerias.ProveedorComparaciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Persona> personas =
                Arrays.asList(
                        new Persona("Juan",10,"juan@hotmail.com"),
                        new Persona("Mario",20,"mario@hotmail.com"),
                        new Persona("Arturo",30,"arturo@hotmail.com"),
                        new Persona("Maria",40,"maria@hotmail.com"),
                        new Persona("Beatriz",50,"beatriz@hotmail.com"),
                        new Persona("Olivia",60,"olivia@hotmail.com"),
                        new Persona("Angel",70,"angel@hotmail.com"),
                        new Persona("Omar",80,"omar@hotmail.com"),
                        new Persona("Pamela",90,"pamela@hotmail.com"),
                        new Persona("Sadee",25,"sadee@hotmail.com")
                );
        System.out.println("Personas sin ordenar: ");
        personas.forEach(p-> System.out.println(p));
        System.out.println("");
        /*
        Collections.sort(personas,(persona1,persona2)->Persona.compararPorEdad(persona1,persona2));
        */
        Collections.sort(personas,Persona::compararPorEdad);
        System.out.println("Personas ordenadas por edad: ");
        personas.forEach(p-> System.out.println(p));

        ProveedorComparaciones proveedorComparaciones = new ProveedorComparaciones();

        Collections.sort(personas,proveedorComparaciones::comparaPorNombre);
        System.out.println("Personas ordenadas por nombre: ");
        personas.forEach(System.out::println);

    }

}
