package entites;

public class TestAdressePostale {
    public static void main(String[] args) {

        AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroDeRue = 5;
        adresse1.libelléRue = "Avenue charles de gaulle";
        adresse1.codePostal = 33000;
        adresse1.ville = "Bordeaux";

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroDeRue = 24;
        adresse2.libelléRue = "Avenue des champs élysées";
        adresse2.codePostal = 75000;
        adresse2.ville = "Paris";
    }
}
