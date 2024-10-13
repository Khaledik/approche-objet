package fr.diginamic.jdr;

public abstract class Creature {

    int force;
    int pv;

    public Creature(int force, int pv) {
        this.force = force;
        this.pv = pv;
    }
}
