package fr.diginamic.banque.entites;

public abstract class Operation {

    String dateOperation;
    double montantOperation;

    public Operation(String dateOperation, double montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

//    @Override
//    public String toString() {
//        return "Date : " + dateOperation + " Montant : " + montantOperation;
//    }

    public abstract String getType();

    ;
}
