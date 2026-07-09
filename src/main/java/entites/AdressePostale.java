package entites;

public class AdressePostale {

    int numeroDeRue;
    String libelleRue;
    int codePostal;
    String ville;

    public AdressePostale(int numeroDeRue, String libelleRue, int codePostal, String ville) {
        this.numeroDeRue = numeroDeRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public void showAdress() {
        System.out.println(this.numeroDeRue + " " + this.libelleRue + " " + codePostal + " " + ville);
    }

}
