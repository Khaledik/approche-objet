package fr.diginamic.operations;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculMoyenne {

    double[]  array = new double[0];

//  Ajouter un élement au tableau array
    public void ajout (double number) {
//      On augmente la taille du tableau
        double[] newArray = new double[array.length + 1];

//      On copie les élement de l'ancien tableau dans le nouveau
        for (int i = 0; i < array.length ; i++) {
            newArray[i] = array[i];
        }

//      On ajoute le nombre à la fin du tableau
        newArray[array.length] = number;

//      On reassigne l'ancien tableau avec les données du nouveau
        array = newArray;
    }

    public double calcul() {

        if (array.length == 0) {
            return 0;
        }

        double result = 0;

        for (int i = 0; i < array.length ; i++) {
            result += array[i];
        }

        return result / array.length;
    }


}
