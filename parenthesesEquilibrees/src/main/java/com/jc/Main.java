package com.jc;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        tester("({[]})");
        tester("({[})");
    }
    private static void tester(String expression) {
        boolean resultat = estEquilibrees(expression);
        System.out.printf("%-20s → %s%n", "\"" + expression + "\"", resultat);


    }
    public static boolean estEquilibrees(String equilibrees) {
       Stack<Character> pile  = new Stack<Character>();

       for(char c : equilibrees.toCharArray()) {
           //Si c'est un symbole ouvrant on l'empile
           if(c =='(' || c == '[' || c == '{'){
               pile.push(c);
           }
           //Si c'est un symbole fermant
           else if(c ==')' || c ==']' || c =='}') {
               //Si la pile est vide, pas de correspondance
               if(pile.empty()) {
                   return false;
               }

               char ouvrant = pile.pop();

               //Verifier la correspondance
               if(!correspondant(ouvrant, c)){
                   return false;
               }
           }
           //Ignorer les autres caracteres
       }
  //La pile doi être vide à la fin
        return  pile.empty();
    }
    /**
     * Vérifie si un symbole ouvrant correspond au symbole fermant
     */
    private static boolean correspondant(char ouvrant, char fermant) {
        return (ouvrant == '(' && fermant == ')') ||
                (ouvrant == '[' && fermant == ']') ||
                (ouvrant == '{' && fermant == '}');
    }

}