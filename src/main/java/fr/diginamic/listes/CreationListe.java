package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {

        ArrayList<Integer> oneToHundred = new ArrayList<Integer>();

        for (int i = 1; i <= 100 ; i++) {
            oneToHundred.add(i);
        }

        System.out.println(oneToHundred.size());


    }
}
