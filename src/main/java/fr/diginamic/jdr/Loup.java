package fr.diginamic.jdr;

import java.util.Random;

public class Loup extends Creature {

    public Loup(int force, int pv) {
        super(force, pv);
    }

    public static Loup create() {

        Random rand = new Random();
        int randomForce = rand.nextInt(8 - 3 + 1) + 3;
        int randomPv = rand.nextInt(10 - 5 + 1) + 5;

        return new Loup(randomForce, randomPv);
    }

    @Override
    public String getRace() {
        return "Loup";
    }

}
