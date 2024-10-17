package fr.diginamic.jdr;

import java.util.Random;

public abstract class Creature {

    int force;
    int pv;

    public Creature(int force, int pv) {
        this.force = force;
        this.pv = pv;
    }

    @Override
    public String toString() {
        return getRace() + ": Force: " + force + " Points de vie: " + pv;
    }

    public int attack() {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 1) + 1) + 1;
        return this.force + randomNum;
    }


    public abstract String getRace();


    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }
}
