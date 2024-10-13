package fr.diginamic.jdr;

import java.util.Random;

public class Personnage {

    int force;
    int pv;
    int score;



    public Personnage(int force, int pv, int score) {
        this.force = force;
        this.pv = pv;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Stats [force= " + force + ", pv= " + pv + ", score= " + score + "]";
    }

    public String create() {

        Random rand = new Random();
        int randomForce = rand.nextInt(18 - 12 + 1) + 12;
        int randomPv = rand.nextInt(50 - 20 + 1) + 20;
        int score = 0;

        Personnage p = new Personnage(randomForce, randomPv, score);

        return "Personnage créé ! \n" + p;

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
