package com.jc;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
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