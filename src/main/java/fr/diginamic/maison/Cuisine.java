package fr.diginamic.maison;

public class Cuisine extends Piece {


    public Cuisine(String nom, int etage, double superficie) {
        super(nom, etage, superficie);
    }

    @Override
    public String getType() {
        return "Cuisine";
    }
}
