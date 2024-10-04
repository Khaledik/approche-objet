package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    public void whatsYourName() {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    public void myLastNameIs(String nom) {
        this.nom = nom;
    }

    public void myFirstNameIs(String prenom) {
        this.prenom = prenom;
    }

    public void editMyAdress(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }

    public void sayMyLastName() {
        System.out.println(this.nom);
    }

    public void sayMyFirstName() {
        System.out.println(this.prenom);
    }

    public void sayMyAdress() {
        this.adressePostale.showAdress();
    }

}
