package fr.diginamic.listes;

import java.util.*;

public class TestListeInt {
    public static void main(String[] args) {

        ArrayList<Integer> listOfInts = new ArrayList<Integer>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

        System.out.println(listOfInts);
        System.out.println(listOfInts.size());
        System.out.println(Collections.max(listOfInts));

        Iterator<Integer> iterator = listOfInts.iterator();

        int max = Integer.MIN_VALUE;
        while (iterator.hasNext()) {

            int current =  iterator.next();
            if (current > max) {
                max = current;
            }
        }
        System.out.println(max);


        iterator = listOfInts.iterator();

        int min = Integer.MAX_VALUE;
        while (iterator.hasNext()) {

            int current =  iterator.next();

            if (current < min) {
                min = current;
            }

        }

        System.out.println(min);
        listOfInts.remove((Integer) min);
        System.out.println(listOfInts);


        for (int i = 0; i < listOfInts.size() ; i++) {
            int num = listOfInts.get(i);

            if (num < 0) {
                listOfInts.set(i, Math.abs(num));
            }
        }

        System.out.println(listOfInts);





    }
}
