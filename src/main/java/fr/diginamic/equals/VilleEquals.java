package fr.diginamic.equals;

public class VilleEquals {

    private String nom;
    private int nbHabitants;

    public VilleEquals(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    @Override
    public String toString() {
        return nom + " " + nbHabitants + " Habitants";
    }

    @Override
    public boolean equals(Object obj) {

        if (! (obj instanceof VilleEquals)) {
            return false;
        }

        VilleEquals other = (VilleEquals)obj;
        return this.nom.equals(other.nom) && this.nbHabitants == other.nbHabitants;


    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

}
