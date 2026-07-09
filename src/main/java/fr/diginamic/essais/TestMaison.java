package fr.diginamic.essais;

import fr.diginamic.maison.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();

//      RDC
        Chambre chambre1 = new Chambre("Chambre1", 0, 15.20);
        Chambre chambre2 = new Chambre("Chambre2", 0, 12.14);
        Salon salon = new Salon("Salon RDC", 0, 32.55);
        WC wc = new WC("Toilettes RDC", 0, 7.08);
        SalleDeBain sdb = new SalleDeBain("Salle de bain RDC", 0, 10.65);

        maison.ajouterPiece(chambre1);
        maison.ajouterPiece(chambre2);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(wc);
        maison.ajouterPiece(sdb);

//      Étage 1
        Chambre chambre3 = new Chambre("Chambre3", 1, 12.14);
        Chambre chambre4 = new Chambre("Chambre2", 1, 15.20);
        WC wc2 = new WC("Toilettes 2", 1, 7.08);
        SalleDeBain sdb2 = new SalleDeBain("Salle de bain 2", 1, 10.65);

        maison.ajouterPiece(chambre3);
        maison.ajouterPiece(chambre4);
        maison.ajouterPiece(wc2);
        maison.ajouterPiece(sdb2);

        System.out.println(maison);
        System.out.println(maison.superficieEtage(0));
        System.out.println(maison.superficieEtage(1));
        System.out.println(maison.superficieTotale());

        System.out.println("\n");

        System.out.println(maison.superficieGlobale(chambre1));
        System.out.println(maison.superficieGlobale(salon));
        System.out.println(maison.superficieGlobale(sdb));
        System.out.println(maison.superficieGlobale(wc));

        System.out.println("\n");

        System.out.println(maison.getNombresPiecesTypes(chambre1));
        System.out.println(maison.getNombresPiecesTypes(salon));
        System.out.println(maison.getNombresPiecesTypes(sdb));
        System.out.println(maison.getNombresPiecesTypes(wc));
    }
}
