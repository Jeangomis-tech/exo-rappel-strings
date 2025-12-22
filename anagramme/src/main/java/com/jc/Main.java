package com.jc;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     //Vérifier si le mot est un anagramme

        System.out.println(isAnagramme("listen", "silent"));
    }

    public static boolean isAnagramme(String str1, String str2){
        //Vérifier les cas limites
        if(str1.length()!=str2.length()) return false;

        //Transformer les chaines en tableaux de caractères
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        //Trier les tableaux
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //Comparer les deux tableaux
        return Arrays.equals(arr1, arr2);
    }
}