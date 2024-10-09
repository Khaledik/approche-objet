package fr.diginamic.sets;

public class Pays {
    private String nom;
    private  int nbHabitants;
    private int pibHabitant;

    public Pays (String nom, int nbHabitants, int pibHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibHabitant = pibHabitant;
    }

    @Override
    public String toString() {
        return "Pays : " + nom + " | " + nbHabitants + " Habitants | " + pibHabitant + " Pib/Habitant | Pib/Total : " + this.nbHabitants * this.pibHabitant;
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

    public double getPibHabitant() {
        return pibHabitant;
    }

    public void setPibHabitant(int pibHabitant) {
        this.pibHabitant = pibHabitant;
    }

}
