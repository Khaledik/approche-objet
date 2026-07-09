package fr.diginamic.tri;

public class VilleTri implements Comparable<VilleTri> {

    private String nom;
    private int nbHabitants;

    public VilleTri(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    @Override
    public int compareTo(VilleTri autre) {

        if (this.nbHabitants < autre.nbHabitants) {
            return -1;
        }else if (this.nbHabitants > autre.nbHabitants) {
            return 1;
        } else {
            return 0;
        }


//        return this.nom.compareTo(autre.nom);
    }

    @Override
    public String toString() {
        return nom + " " + nbHabitants + " Habitants";
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
