package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<String>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));


        String mostLetters = city.getFirst();

        for (int i = 0; i < city.size(); i++) {
            String current = city.get(i);

            if (mostLetters.length() < current.length()) {
                mostLetters = current;
            }
        }

        System.out.println(mostLetters);

        for (int i = 0; i < city.size(); i++) {
            String cit = city.get(i);


            city.set(i, cit.toUpperCase());


        }

//        for (int i = 0; i < city.size(); i++) {
//            String cit = city.get(i);
//
//            if (cit.charAt(0) == 'N') {
//                city.remove(i);
//            }
//
//        }

        city.removeIf(ville -> ville.startsWith("N"));

        System.out.println(city);


    }
}
