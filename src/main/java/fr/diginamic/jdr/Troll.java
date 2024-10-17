package fr.diginamic.jdr;

import java.util.Random;

public class Troll extends Creature {

    public Troll(int force, int pv) {
        super(force, pv);
    }

    public static Troll create() {

        Random rand = new Random();
        int randomForce = rand.nextInt(15 - 10 + 1) + 10;
        int randomPv = rand.nextInt(30 - 20 + 1) + 20;

        return new Troll(randomForce, randomPv);
    }

    @Override
    public String getRace() {
        return "Troll";
    }

}
