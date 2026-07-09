package fr.diginamic.maison;

public class Salon extends Piece {


    public Salon(String nom, int etage, double superficie) {
        super(nom, etage, superficie);
    }

    @Override
    public String getType() {
        return "Salon";
    }
}
