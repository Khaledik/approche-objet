package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {


        Personne personne1 = new Personne();
        personne1.nom = "IKHLEF";
        personne1.prenom = "KHALED";
        personne1.adressePostale = new AdressePostale() ;
        personne1.adressePostale.numeroDeRue = 5;
        personne1.adressePostale.libelléRue = "rue de chat";
        personne1.adressePostale.codePostal = 13000;
        personne1.adressePostale.ville = "Marseille";

        Personne personne2 = new Personne();
        personne2.nom = "DUJARDIN";
        personne2.prenom = "JEAN";
        personne2.adressePostale = new AdressePostale() ;
        personne2.adressePostale.numeroDeRue = 20;
        personne2.adressePostale.libelléRue = "rue de chien";
        personne2.adressePostale.codePostal = 34000;
        personne2.adressePostale.ville = "Montpellier";


    }





}
