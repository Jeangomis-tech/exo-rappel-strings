package com.jc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr ={-2, 1, -3, 2, -1, 2, 1, -5};
        System.out.println(maxSubArray(arr));

    }
    public static int maxSubArray(int[] nums) {
        int maxCourant = nums[0];
        int maxGlobal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //On choisit soit de continuer le sous tableau, soit de repartir de l'élément courant
            maxCourant = Math.max(nums[i], maxCourant + nums[i]);
            //Mise à jour maximum global
            maxGlobal = Math.max(maxGlobal, maxCourant);
        }
      return maxGlobal;
    }
}