package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

    private int nbJoursTravail;
    private double montantJournalier;

    public Pigiste(String nom, String prenom, int nbJoursTravail, double montantJournalier) {
        super(nom, prenom);
        this.nbJoursTravail = nbJoursTravail;
        this.montantJournalier = montantJournalier;
    }

    @Override
    public double getSalaire() {
        return nbJoursTravail * montantJournalier;
    }

    @Override
    public  String getStatus() {
        return "Pigiste";
    }




    public int getNbJoursTravail() {
        return nbJoursTravail;
    }

    public void setNbJoursTravail(int nbJoursTravail) {
        this.nbJoursTravail = nbJoursTravail;
    }

    public double getMontantJournalier() {
        return montantJournalier;
    }

    public void setMontantJournalier(double montantJournalier) {
        this.montantJournalier = montantJournalier;
    }
}
