package fr.diginamic.jdr;

import java.util.Random;

public class Personnage {

    int force;
    int pv;
    int score;

    //  COULEURS
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";



    public Personnage(int force, int pv, int score) {
        this.force = force;
        this.pv = pv;
        this.score = score;
    }

    @Override
    public String toString() {
        return YELLOW + "Statistiques : " + RESET + "Force: " + force + " | Points de vie: " + pv + " | Score: " + score;
    }

    public static Personnage create() {

        Random rand = new Random();
        int randomForce = rand.nextInt(18 - 12 + 1) + 12;
        int randomPv = rand.nextInt(50 - 20 + 1) + 20;
        int score = 0;

        return new Personnage(randomForce, randomPv, score);

    }

    public int attack() {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 1) + 1) + 1;
        return this.force + randomNum;
    }

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
