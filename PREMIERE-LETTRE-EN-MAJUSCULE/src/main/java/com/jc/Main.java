package com.jc;

import java.util.Arrays;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(firstCaaracterUpperCase("bonjour le monde"));

    }

    public static String firstCaaracterUpperCase(String str) {

        return Arrays.stream(str.split(" "))
                .filter(mot->!mot.isEmpty())
                .map(mot->mot.substring(0,1).toUpperCase() + mot.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}