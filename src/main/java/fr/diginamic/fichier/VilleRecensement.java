package fr.diginamic.fichier;

public class VilleRecensement {

    private String nom;
    private String codeDepartement;
    private String region;
    private int population;

    public VilleRecensement(String nom, String codeDepartement, String region, int population) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.region = region;
        this.population = population;
    }

    @Override
    public String toString() {
//        return "Nom;" + nom + ";Code département;"+ codeDepartement + ";Nom de la région;" + region + ";Population totale;" + population;
        return nom + ";"+ codeDepartement + ";" + region + ";" + population;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
