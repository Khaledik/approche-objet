package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {


        Personne personne1 = new Personne("Ikhlef", "Khaled", new AdressePostale(5, "rue de chat", 13000, "Marseille"));


        Personne personne2 = new Personne("Dujardin", "Jean", new AdressePostale(20, "rue de tigre", 34000, "Montpellier"));

        personne1.myLastNameIs("Baba");
        personne1.myFirstNameIs("Yaga");
        personne1.whatsYourName();

        personne1.editMyAdress(new AdressePostale(7, "rue de l'aigle", 95000, "Enghien-les-bains"));

        personne1.sayMyLastName();
        personne1.sayMyFirstName();
        personne1.sayMyAdress();
    }


}
