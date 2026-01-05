package com.jc;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      int[] arr = {1, 2, 2, 3, 3, 3, 5,5,5,5,5,6,6,5};
        Map<Integer, Integer> frequence =compterFrequence(arr);
        afficherFrequence(frequence);

    }
    //Methode pour compter la frequence des elements
    public static Map<Integer, Integer> compterFrequence(int[] tableau){

        Map<Integer, Integer> frequence = new HashMap<>();
        for(int element: tableau){

            //getOrDefault retourne 0 si l'élément n'éxiste pas encore
            frequence.put(element, frequence.getOrDefault(element, 0) + 1);
        }
        return frequence;
    }
    public static void afficherFrequence(Map<Integer, Integer> frequence) {
        System.out.print("{");
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : frequence.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue());
            if (i < frequence.size() - 1) {
                System.out.print(", ");
            }
            i++;
        }
        System.out.println("}");
    }

}