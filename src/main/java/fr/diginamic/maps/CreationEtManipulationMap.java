package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Set;

public class CreationEtManipulationMap {
    public static void main(String[] args) {

//      Exo 2
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        for (int departement : mapVilles.keySet()) {
            System.out.println(departement);
        }

        for(String ville : mapVilles.values()) {
            System.out.println(ville);
        }

        System.out.println(mapVilles.size());
    }
}
