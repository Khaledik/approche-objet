package fr.diginamic.operations;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne moyenne = new CalculMoyenne();

        moyenne.ajout(5.78);
        moyenne.ajout(20);
        moyenne.ajout(18.70);

        System.out.println(moyenne.calcul());
    }
}
