package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.Arrays;

public class Maison {

    private ArrayList<Piece> maison = new ArrayList<>();


    public void ajouterPiece(Piece piece) {
        if (piece != null) {
            this.maison.add(piece);
        }
    }

    @Override
    public String toString() {
        return maison.toString();
    }

    public String superficieTotale() {
        double superficieTotale = 0;

        for (Piece piece : this.maison) {
            superficieTotale += piece.getSuperficie();
        }

        return "La superficie totale de la maison est de " + String.format("%.2f", superficieTotale) + " m²";
    }

    public String superficieEtage(int etage) {
        double superficieEtage = 0;

        for (Piece piece : this.maison) {

            if (piece.getEtage() == etage) {
                superficieEtage += piece.getSuperficie();
            }

        }

        return "La superficie de l'étage " + etage + " est de " + superficieEtage + " m²";
    }


    public String superficieGlobale(Piece piece) {
        String type = piece.getType();
        double superficieGlobalePiece = 0;


        for (Piece piece2 : this.maison) {
            if (piece2.getType().equals(type)) {
                superficieGlobalePiece += piece2.getSuperficie();
            }
        }

        return "La superficie totale des pièces de type " + type + " est de " + String.format("%.2f", superficieGlobalePiece) + " m²";

    }

    public String getNombresPiecesTypes(Piece piece) {
        String type = piece.getType();
        int nombresPieces = 0;

        for (Piece piece3 : this.maison) {
            if (piece3.getType().equals(type)) {
                nombresPieces++;
            }
        }

        return "Le nombres de pièces de type " + type + " est de " + nombresPieces;


    }


}
