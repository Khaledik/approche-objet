package fr.diginamic.banque.entites;

import java.util.Objects;

public class TestOperation {
    public static void main(String[] args) {

        Operation[] tableauOperation = {
                new Credit("07/05/2024", 100),
                new Credit("07/09/2024", 255.64),
                new Debit("09/03/2024", 55.64),
                new Debit("07/10/2024", 24.99),
        };

        double total = 0;

        for(Operation operation : tableauOperation) {
            System.out.println( operation.getType() + " " + operation.dateOperation + " " + operation.montantOperation);

            if (Objects.equals(operation.getType(), "CREDIT")) {
                total += operation.montantOperation;
            } else if (Objects.equals(operation.getType(), "DEBIT")) {
                total -= operation.montantOperation;
            }
        }

        System.out.println("Total : " + total);
    }
}
