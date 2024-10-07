package fr.diginamic.banque.entites;

public class TestBanque {

    public static void main(String[] args) {

        Compte monCompte = new Compte(145482521, 400.94);

        System.out.println(monCompte.toString());
//      Je constate que cela ne m'affiche pas le contenu de mon instance monCompte
    }
}
