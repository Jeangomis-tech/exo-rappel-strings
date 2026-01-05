package com.jc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int[] arr = {1,2,2,3,4,4,5};

        System.out.println(supprimerDoublonsStream(arr));
    }

    public static Set<Integer> supprimerDoublons(int[] arr){
        Set<Integer> set = new HashSet<>();
        // Parcourir le tableau et ajouter chaque élément au Set
        for(int element : arr){
            set.add(element);  // Le Set ignore automatiquement les doublons
        }
        return set;
    }
    // Avec version avec Arrays.stream (Java 8+)

    public static Set<Integer> supprimerDoublonsStream(int[] arr){
        Set<Integer> set2 = new HashSet<>();

        Arrays.stream(arr).forEach(set2::add);
        return set2;
    }
}