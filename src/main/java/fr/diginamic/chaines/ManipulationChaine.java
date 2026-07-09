package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

import java.util.Arrays;

public class ManipulationChaine {
    public static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println(premierCaractere);

        int longeurChaine = chaine.length();
        System.out.println("La longeur de la chaine de caractères est " + longeurChaine);

        int indexOfPointVirgule = chaine.indexOf(';');
        System.out.println("L'index du premier point virgule est " + indexOfPointVirgule);

        String nomDeFamille = chaine.substring(chaine.indexOf('D'), chaine.indexOf(';'));
        System.out.println(nomDeFamille);

        System.out.println(nomDeFamille.toUpperCase());
        System.out.println(nomDeFamille.toLowerCase());


        String[] chaineSplit = chaine.split(";");
        String nom = chaineSplit[0];
        String prenom = chaineSplit[1];
        double salaire  = Double.parseDouble(chaineSplit[2].replace(" ", "")) ;
        System.out.println(salaire);



        Salarie employe = new Salarie(chaineSplit[0],chaineSplit[1], salaire  );
        System.out.println(employe);




    }
}
