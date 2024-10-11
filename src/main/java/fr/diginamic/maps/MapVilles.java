package fr.diginamic.maps;

import fr.diginamic.listes.Ville;

import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {

//       Exo 4
        HashMap<Integer, Ville> villesMap = new HashMap<>();

        villesMap.put(1, new Ville("Nice", 343000));
        villesMap.put(2, new Ville("Carcassonne", 47800));
        villesMap.put(3, new Ville("Narbonne", 53400));
        villesMap.put(4, new Ville("Lyon", 484000));
        villesMap.put(5, new Ville("Foix", 9700));
        villesMap.put(6, new Ville("Pau", 77200));
        villesMap.put(7, new Ville("Marseille", 850700));
        villesMap.put(8, new Ville("Tarbes", 40600));

        Ville villeMoinsHabitant = null;
        int villeASuprr = 0;

        for(int num : villesMap.keySet()) {

            Ville ville = villesMap.get(num);
            if (villeMoinsHabitant == null || ville.getNbHabitants() < villeMoinsHabitant.getNbHabitants()) {
                villeMoinsHabitant = ville;
                villeASuprr = num;
            };

        }

        System.out.println(villeMoinsHabitant);


        villesMap.remove(villeASuprr);

        System.out.println(villesMap);



    }
}
