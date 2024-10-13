package fr.diginamic.maison;

public class WC extends Piece {


    public WC(String nom, int etage, double superficie) {
        super(nom, etage, superficie);
    }

    @Override
    public String getType() {
        return "WC";
    }

}
