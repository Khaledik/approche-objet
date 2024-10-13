package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("Le Cratère", 200);

        theatre.inscrire(45, 17.99);
        theatre.inscrire(100, 17.99);
        theatre.inscrire(55, 17.99);
        theatre.inscrire(1, 17.99);

        System.out.println("Nom du Théâtre : " + theatre.getNom());
        System.out.println("Total de clients inscrits : " + theatre.getTotalClients());
        System.out.println("Recette totale de l'établissement : " + String.format("%.2f", theatre.getRecetteTotal())  + "€");
    }
}
