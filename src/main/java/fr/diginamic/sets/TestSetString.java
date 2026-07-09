package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {

        HashSet<String> hashSetString = new HashSet<String>(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));


        System.out.println(hashSetString);

        String mostLetters = null;

        for (String ville : hashSetString) {
            if (mostLetters == null || mostLetters.length() < ville.length()) {
                mostLetters = ville;
            }
        }

        System.out.println(mostLetters);
        hashSetString.remove((String) mostLetters);
        System.out.println(hashSetString);


    }
}
