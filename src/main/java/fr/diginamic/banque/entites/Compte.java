package fr.diginamic.banque.entites;

public class Compte {

    private String numeroDeCompte;
    private double soldeDuCompte;

    public Compte(String numeroDeCompte, double soldeDuCompte) {
        this.numeroDeCompte = numeroDeCompte;
        this.soldeDuCompte = soldeDuCompte;
    }

    @Override
    public String toString() {
        return "Compte numéro : " + numeroDeCompte + ", Solde : " + soldeDuCompte + " €";
    }


    public String getNumeroDeCompte() {
        return numeroDeCompte;
    }

    public void setNumeroDeCompte(String numeroDeCompte) {
        this.numeroDeCompte = numeroDeCompte;
    }

    public double getSoldeDuCompte() {
        return soldeDuCompte;
    }

    public void setSoldeDuCompte(double soldeDuCompte) {
        this.soldeDuCompte = soldeDuCompte;
    }


}
