package fr.diginamic.testenumeration;

public enum Saison {

    PRINTEMPS("Printemps", 1),
    ETE("Été", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private String nom;
    private int ordre;

    private Saison(String nom, int ordre) {
        this.nom = nom;
        this.ordre = ordre;
    }

    public static Saison SelectSaison(String nom) {
        return Saison.valueOf(nom.toUpperCase());
    }

    public String getNom() {
        return nom;
    }
}
