package org.example.stream;

import java.util.Random;
import java.util.stream.Stream;

public class CrearStream2 {
    public static void main(String[] args) {
        Stream<Long> primerosDiez = Stream.iterate(1L , n -> n+1).limit(10);
        primerosDiez.forEach(System.out::println);

        Stream.iterate(1L, n -> n + 1 )
                .filter(n-> n % 2 == 0)
                .limit(20)
                .forEach(System.out::println);

        System.out.println("\n despues de 100");
        Stream.iterate(1L, n -> n + 1 )
                .filter(n-> n % 2 == 0)
                .skip(100)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("\n Numeros aleatorios");
        Stream.generate(Math::random).limit(5).forEach(System.out::println);

        new Random().ints()
                .limit(5)
                .forEach(System.out::println);
    }
}
