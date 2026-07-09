package fr.diginamic.essais;

import fr.diginamic.jdr.*;

import java.util.Random;
import java.util.Scanner;

public class TestJdr {

    //  COULEURS
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    //  On créé le Principale Menu du JDR avec une méthode pour le réutilisé
    public static void afficherMenu() {
        System.out.println(YELLOW + "---------MENU---------" + RESET);
        System.out.println(BLUE + "1. Créer le personnage" + RESET);
        System.out.println(BLUE + "2. Combattre une créature" + RESET);
        System.out.println(BLUE + "3. Afficher score" + RESET);
        System.out.println(RED + "4. Sortir" + RESET);
    }

    //  On créé le Principale Menu du JDR avec une méthode pour le réutilisé
    public static void afficherMenuCombat() {
        System.out.println(RED + "---------Combattre---------" + RESET);
        System.out.println(YELLOW + "1. Loup" + RESET);
        System.out.println(GREEN + "2. Gobelin" + RESET);
        System.out.println(BLUE + "3. Troll" + RESET);
        System.out.println(RED + "4. Sortir" + RESET);
    }

    public static void main(String[] args) {

//      On initialise le scanner
        Scanner scanner = new Scanner(System.in);

//      On initialise à 0 la variable de selection de l'utilisateur
        int selection = 0;
        Personnage joueur = null;


        do { // On applique les instruction du do

//          On affiche le menu
            afficherMenu();

//          On lit la selection de l'utilisateur
            selection = scanner.nextInt();


            switch (selection) {
                case 1:
                    joueur = Personnage.create();
                    System.out.println(GREEN + "Personnage crée : \n" + RESET + joueur);
                    break;
                case 2:
                    if (joueur != null) {
                        afficherMenuCombat();
                        int creatureSelection = scanner.nextInt();
                        Creature creature = null;

                        switch (creatureSelection) {
                            case 1:
                                creature = Loup.create();
                                break;
                            case 2:
                                creature = Gobelin.create();
                                break;
                            case 3:
                                creature = Troll.create();
                                break;
                        }

                        System.out.println("Vous affrontez un " + YELLOW + creature.getRace() + RESET + " ! \n");


                        while (joueur.getPv() > 0 && creature.getPv() > 0) {

                            int attackJoueur = joueur.attack();
                            int attackCreature = creature.attack();


                            if (attackJoueur > attackCreature) {
                                creature.setPv(creature.getPv() - (attackJoueur - attackCreature));
                                System.out.println(GREEN + "Attaque réussi !" + RESET + " vous avez infligé " + (attackJoueur - attackCreature) + "pts de dégats à la créature. \n");
                            } else if (attackCreature > attackJoueur) {
                                joueur.setPv(joueur.getPv() - (attackCreature - attackJoueur));
                                System.out.println(RED + "Attaque échoué !" + RESET + " vous avez subit " + (attackCreature - attackJoueur) + "pts de dégats de la créature. \n");
                            }

                            if (joueur.getPv() <= 0) {
                                System.out.println(RED + "PERDU !" + RESET + " Votre personnage est mort..... \n " + YELLOW + "Score : " +  joueur.getScore());
                            } else if (creature.getPv() <= 0) {
                                String createRace = creature.getRace();

                                switch (createRace) {
                                    case "Loup":
                                        joueur.setScore(joueur.getScore() + 1);
                                        break;
                                    case "Gobelin":
                                        joueur.setScore(joueur.getScore() + 2);
                                        break;
                                    case "Troll":
                                        joueur.setScore(joueur.getScore() + 5);
                                        break;
                                }

                                System.out.println(GREEN + "GAGNÉ !" + RESET + " Vous avez vaincu la créature ! \n " + "Nouveau Score : " + joueur.getScore() + "\n");
                            }


                        }

                    } else {
                        System.out.println(RED + "Veuillez créer le personnage avant de commencer un combat." + RESET);
                    }


                    break;
                case 3:
                    if (joueur != null) {
                        System.out.println(YELLOW + "Score : " + RESET + joueur.getScore());
                    } else {
                        System.out.println(RED + "Veuillez créer le personnage avant de consulter son score." + RESET);
                    }
                    break;
                default:
                    if (selection != 4) {
                        System.out.println(RED + "Ce choix n'existe pas !" + RESET);
                    }
                    break;
            }

        } while (selection != 4); // Tant que l'utilisateur ne veut pas quitter le jeu


//      On autorise plus la lecture de selection de l'utlisateur
        scanner.close();


    }

}
