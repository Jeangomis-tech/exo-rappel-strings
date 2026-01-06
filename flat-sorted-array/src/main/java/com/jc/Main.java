package com.jc;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};

        int[] resultat = fusionner1(a, b);

        System.out.println(Arrays.toString(resultat));
    }
    public static int[] fusionner(int[] t1, int[] t2) {
        return IntStream.concat(Arrays.stream(t1), Arrays.stream(t2))
                .sorted()
                .toArray();
    }
    // Avec flatMap
    public static int[] fusionner1(int[] t1, int[] t2) {
        return Stream.of(t1, t2)
//                .flatMapToInt(Arrays::stream)
                .flatMapToInt(IntStream::of)
                .sorted()
                .toArray();
    }
}