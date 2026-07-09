package fr.diginamic.maps;

public class Pays {

    private String nom;
    private int nbHabitants;
    private String continent;

    public Pays(String nom, int nbHabitants, String continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public String getContinent() {
        return continent;
    }
}
