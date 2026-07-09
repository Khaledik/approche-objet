package fr.diginamic.testenumeration;

public enum Continent {

    ASIE("Asie"),
    EUROPE("Europe"),
    AMERIQUE("Amerique"),
    OCEANIE("Oceanie"),
    AFRIQUE("Afrique");


    private String nom;




    private Continent(String nom) {
        this.nom = nom;
    }
}
