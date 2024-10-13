package fr.diginamic.maison;

public class SalleDeBain extends Piece {


    public SalleDeBain(String nom, int etage, double superficie) {
        super(nom, etage, superficie);
    }

    @Override
    public String getType() {
        return "Salle de bain";
    }

}
