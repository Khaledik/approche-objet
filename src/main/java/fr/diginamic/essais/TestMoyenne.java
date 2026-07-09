package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne moyenne = new CalculMoyenne();

        moyenne.ajout(5.78);
        moyenne.ajout(20);
        moyenne.ajout(18.70);

        System.out.println(moyenne.calcul());

        CalculMoyenne moyenne2 = new CalculMoyenne();
        moyenne2.ajout(5);
        moyenne2.ajout(20);
        moyenne2.ajout(5);

        System.out.println(moyenne2.calcul());
    }


}
