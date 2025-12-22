package com.jc;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ecrire une fonfonction qui va compter le nombre de voyelle et de consonne

        System.out.println(compterNombreCaracteres("Le monde est tordu"));
    }

    public static Map<String, Integer> compterNombreCaracteres(String str){

        //Vérifier les cas limites
        if(str ==null) return null;

        Map<String,Integer> result = new HashMap<>();

        result.put("voyelles",0);
        result.put("consonnes",0);
        //Définir les voyelles miniscule et majuscule

        String voyelles = "aeiouàäeéèëïöôAEIOU";

        for(char c : str.toCharArray()){
            //vérifier si c'est une lettre
            if(Character.isLetter(c)){
                if(voyelles.indexOf(c)!=-1){
                    //C'est une voyelle
                    result.put("voyelles", result.get("voyelles") + 1);
                }else{
                    //C'est une consonne
                    result.put("consonnes", result.get("consonnes") + 1);

                }
            }
        }

        return result;
    }

}