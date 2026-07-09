package fr.diginamic.maison;

public class Chambre extends Piece {


    public Chambre(String nom, int etage, double superficie) {
        super(nom, etage, superficie);
    }

    @Override
    public String getType() {
        return "Chambre";
    }


}
