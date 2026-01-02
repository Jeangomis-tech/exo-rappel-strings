package com.jc;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2,3,5,6,4,2, 4,9,7 , 8, 6,5};
        List<Integer> list = doublons(arr);
        System.out.println(list);

    }

    public static List<Integer> doublons(int[] arr){

        Set<Integer> set = new HashSet<>();

        return Arrays.stream(arr)
                .boxed()
                .filter(num->!set.add(num))
                .distinct()
                .collect(Collectors.toList());
    }
}