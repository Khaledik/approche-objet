package fr.diginamic.chaines;

public class TestStringBuilder {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        String string = "";

        long debut = System.currentTimeMillis();

        for (int i = 1; i <= 100000 ; i++) {
//            string += i;
            builder.append(i);
        }

        long fin = System.currentTimeMillis();

        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

//        Stringbuilder : 4ms
//        String operateur + : 3102ms


    }

}
