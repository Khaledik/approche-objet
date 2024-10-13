package fr.diginamic.maison;

public abstract class Piece {

    private String nom;
    private int etage;
    private double superficie;

    public Piece(String nom, int etage, double superficie) {
        this.nom = nom;
        if (etage >= 0) {
            this.etage = etage;
        } else {
            throw new IllegalArgumentException("L'etage doit être supérieur ou égal à 0.");
        }

        if (superficie >= 0) {
            this.superficie = superficie;
        } else {
            throw new IllegalArgumentException("La superficie doit être supérieur ou égal à 0.");
        }
    }


    @Override
    public String toString() {
        return "\n Piece = " + nom + " etage = " + etage + ", superficie = " + superficie + "m² \n";
    }

    public abstract String getType();

    public String getNom() {
        return nom;
    }

    public int getEtage() {
        return etage;
    }

    public double getSuperficie() {
        return superficie;
    }
}
