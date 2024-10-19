package fr.diginamic.essais;

import fr.diginamic.testenumeration.Saison;

public class TestEnumeration {

    public static void main(String[] args) {

        Saison[] saisons = Saison.values();

        for (Saison saison : saisons) {
            System.out.println(saison.getNom());
        }

        String nom = "ETE";
        System.out.println(Saison.valueOf(nom).getNom());

        String libelle = "Hiver";
        System.out.println(Saison.SelectSaison(libelle));


    }

}
