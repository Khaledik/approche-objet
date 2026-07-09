package fr.diginamic.equals;

import fr.diginamic.listes.Ville;

import java.util.ArrayList;

public class TestEquals {

    public static void main(String[] args) {


//      Vérifiez que la méthode equals retourne true pour 2 instances de villes qui ont les mêmes attributs.

        VilleEquals v1 =  new VilleEquals("Nice", 343_000);
        VilleEquals v2 =  new VilleEquals("Nice", 343_000);

        if(v1.equals(v2)) {
            System.out.println("Villes equals");
        } else {
            System.out.println("Villes not equals");
        }

//      Vérifiez maintenant que la méthode retourne false si vous changez un des attributs.


        VilleEquals v3 =  new VilleEquals("Nice", 343_000);
        VilleEquals v4 =  new VilleEquals("Nice", 343_001);

        if(v3.equals(v4)) {
            System.out.println("Villes equals");
        } else {
            System.out.println("Villes not equals");
        }


//      Faites le test maintenant en utilisant l’opérateur == avec les mêmes attributs, puis avec des attributs différents. Que constatez-vous ?
        if(v1 == v2) {
            System.out.println("Villes equals");
        } else {
            System.out.println("Villes not equals");
        }


//     Comment faire pour que la comparaison de 2 villes avec l’opérateur == retourne true.
        v2 = v1;

        if(v1 == v2) {
            System.out.println("Villes equals");
        } else {
            System.out.println("Villes not equals");
        }




    }

}
