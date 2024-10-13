package fr.diginamic.essais;

import fr.diginamic.jdr.Personnage;

import java.util.Random;
import java.util.Scanner;

public class TestJdr {

    public static void main(String[] args) {

        int selection;

        Scanner sc = new Scanner(System.in);


        System.out.println("---------MENU---------");
        System.out.println("1. Créer le personnage");
        System.out.println("2. Combattre une créature");
        System.out.println("3. Afficher score");
        System.out.println("4. Sortir");


        selection = sc.nextInt();

        switch (selection) {
            case 1:
                Random rand = new Random();
                int randomForce = rand.nextInt(18 - 12 + 1) + 12;
                int randomPv = rand.nextInt(50 - 20 + 1) + 20;
                int score = 0;

                Personnage p = new Personnage(randomForce, randomPv, score);
                System.out.println("Personnage créé ! \n " + p);
                break;

        }






    }

}
