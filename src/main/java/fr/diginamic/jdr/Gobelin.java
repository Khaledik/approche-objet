package fr.diginamic.jdr;

import java.util.Random;

public class Gobelin extends Creature {

    public Gobelin(int force, int pv) {
        super(force, pv);
    }

    public static Gobelin create() {

        Random rand = new Random();
        int randomForce = rand.nextInt(15 - 10 + 1) + 10;
        int randomPv = rand.nextInt(30 - 20 + 1) + 20;

        return new Gobelin(randomForce, randomPv);
    }

    @Override
    public String getRace() {
        return "Gobelin";
    }
}
