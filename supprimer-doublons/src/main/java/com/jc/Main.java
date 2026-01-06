package com.jc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[]tableau = {1,2,2,4,4,2,5,3,3};
        Set<Integer> result = removeDuplicated1(tableau);
        System.out.println(result);

    }
    //Supprimer les doublons
    public  static Set<Integer> removeDuplicated(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int element: arr){
            set.add(element);
        }

        return set;
    }
    //Avec l'api stream
    public static Set<Integer> removeDuplicated1(int[] set){

        return Arrays.stream(set)
                .boxed()
                .collect(Collectors.toSet());

    }
}