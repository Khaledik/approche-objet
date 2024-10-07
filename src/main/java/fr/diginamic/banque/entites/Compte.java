package fr.diginamic.banque.entites;

public class Compte {

    static int numeroDeCompte;
    static double soldeDuCompte;

    public Compte(int numeroDeCompte, double soldeDuCompte) {
        this.numeroDeCompte = numeroDeCompte;
        this.soldeDuCompte = soldeDuCompte;
    }

    public  String toString() {
        return "Compte numéro : " + numeroDeCompte + ", Solde : " + soldeDuCompte + " €";
    }


}
