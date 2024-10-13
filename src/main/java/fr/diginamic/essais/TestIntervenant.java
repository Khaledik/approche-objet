package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {

        Pigiste pigiste = new Pigiste("Parker", "Peter", 45, 20);
        Salarie salarie = new Salarie("Jackman", "Hugh", 2300);


        System.out.println(pigiste.getSalaire());
        System.out.println(salarie.getSalaire());

        System.out.println(pigiste.afficherDonnes());
        System.out.println(salarie.afficherDonnes());

    }
}
