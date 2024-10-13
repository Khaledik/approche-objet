package fr.diginamic.entites;

public class Theatre {
    String nom;
    int capaciteMax;
    int totalClients;
    double recetteTotal;

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
    }

    public void inscrire(int nbsClient, double prixPlace) {
        if (totalClients < capaciteMax) {
            totalClients += nbsClient;
            recetteTotal += nbsClient * prixPlace;
        } else {
            System.out.println("Erreur : Plus de place disponible en vente :/");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public int getTotalClients() {
        return totalClients;
    }

    public void setTotalClients(int totalClients) {
        this.totalClients = totalClients;
    }

    public double getRecetteTotal() {
        return recetteTotal;
    }

    public void setRecetteTotal(double recetteTotal) {
        this.recetteTotal = recetteTotal;
    }
}