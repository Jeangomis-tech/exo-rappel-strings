package com.jc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Vérifier si un mot est un palindromle

        System.out.println(isPalindrome("kayak"));

    }
    public static boolean isPalindrome(String str) {

        StringBuilder sb = new StringBuilder(str);
        System.out.println();
        return sb.reverse().toString().equals(str);
    }
}