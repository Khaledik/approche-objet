package fr.diginamic.sets;

import fr.diginamic.annotations.ToString;

import java.lang.reflect.Field;

public class Pays {

    @ToString(upperCase = true, seperator = "->")
    private String nom;

    @ToString(seperator = "Habts")
    private int nbHabitants;

    @ToString(seperator = "PIB/Habts")
    private int pibHabitant;

    public Pays(String nom, int nbHabitants, int pibHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibHabitant = pibHabitant;
    }

    @Override
    public String toString() {
//        return "Pays : " + nom + " | " + nbHabitants + " Habitants | " + pibHabitant + " Pib/Habitant | Pib/Total : " + this.nbHabitants * this.pibHabitant;
        StringBuilder sb = new StringBuilder();
        Field[] fields = this.getClass().getDeclaredFields();

        for (Field field : fields) {

            if (field.isAnnotationPresent(ToString.class)) {
                ToString annotation = field.getAnnotation(ToString.class);

                try {
                    field.setAccessible(true);
                    Object value = field.get(this);

                    // Gérer la mise en majuscules si nécessaire
                    if (annotation.upperCase() && value instanceof String) {
                        value = ((String) value).toUpperCase();
                    }

                    sb.append(value).append(annotation.seperator());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }

        }

        return sb.toString().trim();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public double getPibHabitant() {
        return pibHabitant;
    }

    public void setPibHabitant(int pibHabitant) {
        this.pibHabitant = pibHabitant;
    }

}
