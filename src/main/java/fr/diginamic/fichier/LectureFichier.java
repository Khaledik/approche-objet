package fr.diginamic.fichier;

import fr.diginamic.tri.VilleTri;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LectureFichier {

    public static void main(String[] args) throws IOException {

//      On définit le chemin du fichier source recensement que l'on va utiliser
        Path path = Paths.get("C://Users//khale//Desktop//approche-objet//src//main//java//fr//diginamic//fichier//recensement.csv");

//      On lis toutes les lignes du fichier qu'on stock dans la liste lines
        List<String> lines = Files.readAllLines(path);

////        Exo 1
//        for (String line : lines) {
//            System.out.println(line);
//        }

//      On créé une liste vide de type VilleRecensement qui va stocke nos infos de villes
        List<VilleRecensement> villes = new ArrayList<VilleRecensement>();


//      On fait une boucle for qu'on initialise à 1 pour skip l'en tête
        for (int i = 1; i < lines.size() ; i++) {
//          sur chaque ligne on créér un tableau de string qui va contenir les infos extraite de chaque ligne en splitant sur ;
            String[] parts = lines.get(i).split(";");

//          On récupère dans notre tableau String les infos qui nous interesse qu'on stock dans des variables
            String nom = parts[6];
            String codeDepartement = parts[2];
            String region = parts[1];
            int population = Integer.parseInt(parts[9].replace(" ", ""));

//          On créer une instance de ville à chaque tours
            villes.add(new VilleRecensement(nom, codeDepartement, region, population));
        }



//       On définit le chemin du fichier que l'on va créér
        Path villesTailleMoyenne = Paths.get("C://Users//khale//Desktop//approche-objet//src//main//java//fr//diginamic//fichier//ville-taille-moyenne.csv");

//      On définit une liste de string vide qui va contenir les villes de plus de 25k habitants
        List<String> villesMoyenne = new ArrayList<String>();

//      On ajoute en première ligne de cette liste notre en tête avec le nom de nos colonnes
        villesMoyenne.add("Nom;Code département;Nom de la région;Population totale");


//      On boucles dans la liste ville et on stock seulement les villes qui ont plus de 25k habitants dans la liste villesMoyenne
        for (VilleRecensement ville : villes) {

            if ( ville.getPopulation() > 25000) {

                villesMoyenne.add(String.valueOf(ville));
            }
        }

//      Si le fichier n'existe pas on le créé
        if (!Files.exists(villesTailleMoyenne)) {
            Files.createFile(villesTailleMoyenne);


//      On écrit dedans avec nos données stocké dans notre list de string villesMoyenne
        Files.write(villesTailleMoyenne, villesMoyenne);
        }


        System.out.println(villesMoyenne);















        }
}
