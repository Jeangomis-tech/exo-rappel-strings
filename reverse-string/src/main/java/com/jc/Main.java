package com.jc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Inverser une chaine de caractere
        System.out.println(reverseString("Hello"));

    }
    public static String reverseString(String str) {
        //Recourir a StringBuilder pour bénéficier de la methode reverse

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();

    }
}