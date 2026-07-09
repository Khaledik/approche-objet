package fr.diginamic.tri;


import java.util.ArrayList;
import java.util.Collections;

public class TestVillesTri {
    public static void main(String[] args) {

        ArrayList<VilleTri> villes = new ArrayList<VilleTri>();

        villes.add(new VilleTri ("Nice", 343000));
        villes.add(new VilleTri("Carcassonne", 47800));
        villes.add(new VilleTri("Narbonne", 53400));
        villes.add(new VilleTri("Lyon", 484000));
        villes.add(new VilleTri("Foix", 9700));
        villes.add(new VilleTri("Pau", 77200));
        villes.add(new VilleTri("Marseille", 850700));
        villes.add(new VilleTri("Tarbes", 40600));


        Collections.sort(villes);
        System.out.println(villes);


    }
}
