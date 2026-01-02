package com.jc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr ={7,15, 5,4};
        int cible = 9;
        System.out.println(Arrays.toString( sumTwoNumbers(arr, cible)));

    }

//    public static int[] sumTwoNumbers(int[] arr, int target) {
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr.length; j++){
//                if(arr[i]+arr[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{};
//    }

    public static int[] sumTwoNumbers(int[] arr, int cible) {
        //Map pour stocker : valeur -> index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement  = cible - arr[i];
            //Si le complement éxiste déja dans lke Map
            if (map.containsKey(complement)) {
                 return new int[]{map.get(complement), i};
            }
            //Sinon on ajoute le nombre actuel dans la Map
            map.put(arr[i], i);
        }

        return new int[]{};
    }
}