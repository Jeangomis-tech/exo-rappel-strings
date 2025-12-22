package com.jc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2,3,5,6,4,2, 4,9,7 , 8, 6,5};
        List<Integer> list = doublons(arr);
        System.out.println(list);

    }

    public static List<Integer> doublons(int[] arr){
        //vus : pour mémoriser les éléments déjà rencontrés
       Set<Integer> vus = new HashSet<>();
       //doublons : pour stocker les éléments qui apparaissent plusieurs fois
        Set<Integer> doublons = new HashSet<>();
        for(int num: arr){
            if(!vus.contains(num)){
                vus.add(num);
            }else{
                doublons.add(num);
            }
        }
        return new ArrayList<>(doublons);
    }
}