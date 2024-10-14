package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {

//    Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du 19 mai 2016 à 23h59 et 30 secondes et affichez-la au format suivant :
//    jour/mois/année
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 04, 19,23,59,30);
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        String formatedDate = formateur.format(calendar.getTime());
        System.out.println(formatedDate);


//      Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du jour.
        Calendar calendar2 = Calendar.getInstance();
        Date today = calendar2.getTime();

//      Affichez l’instance ainsi créée au format suivant :
//      année/mois/jour heure:minute:seconde
        SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formatedDate2 = formateur2.format(today);
        System.out.println(formatedDate2);

//     Affichez la même instance avec le nom des jours et des mois en français, russe, chinois et allemand.
        SimpleDateFormat formatFR = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
        SimpleDateFormat formatRU = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
        SimpleDateFormat formatCN = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
        SimpleDateFormat formatDE = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);

        System.out.println("France : " + formatFR.format(today));
        System.out.println("Russie : " + formatRU.format(today));
        System.out.println("Chine : " + formatCN.format(today));
        System.out.println("Allemagne : " + formatDE.format(today));


    }

}
