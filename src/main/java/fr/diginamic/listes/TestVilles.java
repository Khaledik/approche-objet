package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVilles {
    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<Ville>();

        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));


        Iterator<Ville> iterator = villes.iterator();

        Ville villePlusPeuple = null;

        while(iterator.hasNext()) {
            Ville ville = iterator.next();

            if( villePlusPeuple == null || ville.getNbHabitants() > villePlusPeuple.getNbHabitants()) {
                villePlusPeuple = ville;
            }

        }

        System.out.println(villePlusPeuple);


        while(iterator.hasNext()) {
            Ville ville = iterator.next();

            if( villePlusPeuple == null || ville.getNbHabitants() > villePlusPeuple.getNbHabitants()) {
                villePlusPeuple = ville;
            }

        }

        iterator = villes.iterator();

        Ville villeMoinsPeuple = null;

        while(iterator.hasNext()) {
            Ville ville = iterator.next();

            if( villeMoinsPeuple == null || ville.getNbHabitants() < villeMoinsPeuple.getNbHabitants()) {
                villeMoinsPeuple = ville;
            }

        }


        villes.remove((Ville) villeMoinsPeuple);

        System.out.println(villes);





        for (int i = 0; i < villes.size() ; i++) {

            Ville ville = villes.get(i);

            if (ville.getNbHabitants() >= 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }

        }

        System.out.println(villes);





    }
}
