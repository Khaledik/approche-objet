package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {

//      On récupère le chemin Fichier recensement
        Path path = Paths.get("C://Users//khale//Desktop//approche-objet//src//main//java//fr//diginamic//fichier//recensement.csv");
        List<String> lines = Files.readAllLines(path);


//      On indique le chemin du nouveau fichier
        Path centLignesPath = Paths.get("C://Users//khale//Desktop//approche-objet//src//main//java//fr//diginamic//fichier//cent-lignes.csv");

//      On créer une list qui va contenir les 100 premières lignes
        List<String> centLignes= new ArrayList<String>();

//      On remplit la liste avec les 100 premières lignes du fichier recensement
        for (int i = 1; i <= 100 ; i++) {
            centLignes.add(lines.get(i));
        }

//      Si le fichier n'existe pas on le créer et on insere les 100 premières lignes de recensement
        if(!Files.exists(centLignesPath)) {
                Files.write(centLignesPath, centLignes );
        }


    }
}
