package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {


        System.out.println("Addition 25 + 5 = " + Operations.calcul(25, 5, '+'));
        System.out.println("Soustraction 5 - 5 = " + Operations.calcul(5, 5, '-'));
        System.out.println("Multiplication 5 x 5 = " + Operations.calcul(5, 5, '*'));
        System.out.println("Division 12 / 2 = " + Operations.calcul(12, 2, '/'));
        System.out.println("Division 12 / 0 = " + Operations.calcul(12, 0, '/'));
        System.out.println("Gestion d'erreur 12 $ 2 = " + Operations.calcul(12, 2, '$'));

    }


}
