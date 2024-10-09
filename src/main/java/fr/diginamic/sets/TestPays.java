package fr.diginamic.sets;

import java.util.HashSet;

public class TestPays {
    public static void main(String[] args) {

        HashSet<Pays> paysSet = new HashSet<Pays>();

        paysSet.add(new Pays("USA", 331_000_000, 65_000));
        paysSet.add(new Pays("France", 65_200_000, 40_000));
        paysSet.add(new Pays("Allemagne", 83_700_000, 46_000));
        paysSet.add(new Pays("UK", 68_100_000, 43_000));
        paysSet.add(new Pays("Italie", 60_200_000, 35_000));
        paysSet.add(new Pays("Japon", 126_000_000, 40_000));
        paysSet.add(new Pays("Chine", 1_440_000_000, 10_000));
        paysSet.add(new Pays("Russie", 145_000_000, 11_000));
        paysSet.add(new Pays("Inde", 1_380_000_000, 2_000));


        System.out.println(paysSet);

//      Recherchez le pays avec le PIB/habitant le plus important
        Pays plusGrandPib = null;

        for (Pays pays : paysSet) {
            if ( plusGrandPib == null || pays.getPibHabitant() > plusGrandPib.getPibHabitant()) {
                plusGrandPib = pays;
            }

        }

        System.out.println("PIB/habitant le plus important : " + plusGrandPib);

//      Recherchez le pays avec le PIB total le plus important

        Pays plusGrandPibTotal = null;
        Pays plusPetitPibTotal = null;

        for (Pays pays : paysSet) {
            if ( plusGrandPibTotal == null || (pays.getPibHabitant() * pays.getNbHabitants()) > (plusGrandPibTotal.getPibHabitant() * plusGrandPibTotal.getNbHabitants())) {
                plusGrandPibTotal = pays;
            }

            if ( plusPetitPibTotal == null || (pays.getPibHabitant() * pays.getNbHabitants()) < (plusPetitPibTotal.getPibHabitant() * plusPetitPibTotal.getNbHabitants())) {
                plusPetitPibTotal = pays;
            }

        }

        System.out.println("PIB total le plus important : " + plusGrandPibTotal);


//      Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
        plusPetitPibTotal.setNom(plusPetitPibTotal.getNom().toUpperCase());
        System.out.println(plusPetitPibTotal);

//      Supprimez le pays dont le PIB total est le plus petit
        paysSet.remove((Pays) plusPetitPibTotal);

//      Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB total
        System.out.println(paysSet);






//        for (int i = 0; i < paysSet.size() ; i++) {
//            if ()
//        }




    }


}
