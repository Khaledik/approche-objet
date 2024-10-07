package fr.diginamic.banque.entites;

public class Credit extends Operation {

    public Credit(String dateOperation, double montantOperation) {
        super(dateOperation, montantOperation);
    }

//    @Override
//    public String toString() {
//        return "Credit : " + super.toString();
//    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}
