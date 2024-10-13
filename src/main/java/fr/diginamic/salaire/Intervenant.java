package fr.diginamic.salaire;

public abstract class Intervenant {

    private String nom;
    private String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String afficherDonnes() {
        return "Nom : " + getNom() + " | Prénom : " + getPrenom() + " | Salaire : " + getSalaire() + "€ | Status : " + getStatus();
    }

    public abstract double getSalaire();

    public abstract String getStatus();


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
