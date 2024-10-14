package fr.diginamic.dates;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {

//      Créez une instance de la classe java.util.Date à la date du jour en utilisant un de ses constructeurs
        Date date = new Date();

//      Affichez l’instance ainsi créée au format suivant :
//       jour/mois/année (sans la partie heure)
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        String today = formateur.format(date);
        System.out.println(today);


//      Créez une instance de la classe Date à la date du 19/05/2016 à 23 :59 :30 secondes
        Date date1 = new Date(116, 04, 19,23,59,30);
//      Affichez l’instance ainsi créée au format suivant :
//      année/mois/jour heure:minute:seconde
        SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String newDate = formateur2.format(date1);
        System.out.println(newDate);

//      Créez une instance de Date contenant la date/heure système et affichez-la au même format que ci-dessus.
        System.out.println(formateur2.format(date));
    }

}
