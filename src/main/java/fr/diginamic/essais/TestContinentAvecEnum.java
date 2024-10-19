package fr.diginamic.essais;

import fr.diginamic.listes.Ville;
import fr.diginamic.testenumeration.Continent;
import fr.diginamic.testenumeration.VilleEnum;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

    public static void main(String[] args) {

        List<VilleEnum> villes = new ArrayList<>();

        villes.add(new VilleEnum("New York", 8_804_190, Continent.AMERIQUE));
        villes.add(new VilleEnum("Paris", 2_165_423, Continent.EUROPE));
        villes.add(new VilleEnum("Pékin", 21_707_000, Continent.ASIE));
        villes.add(new VilleEnum("Moscou", 13_010_112, Continent.ASIE));
        villes.add(new VilleEnum("Berlin", 3_644_826, Continent.EUROPE));
        villes.add(new VilleEnum("Sydney", 5_312_163, Continent.OCEANIE));
        villes.add(new VilleEnum("Sao Paulo", 12_252_023, Continent.AMERIQUE));
        villes.add(new VilleEnum("Dakar", 1_146_053, Continent.AFRIQUE));

        for (VilleEnum ville : villes) {
            System.out.println(ville);
        }
    }

}
