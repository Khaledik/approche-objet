package fr.diginamic.sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {

        HashSet<Double> hashSet = new HashSet<Double>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

        System.out.println(hashSet);
        System.out.println(Collections.max(hashSet));
        hashSet.remove((double) Collections.min(hashSet));
        System.out.println(hashSet);




    }
}
