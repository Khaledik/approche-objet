package fr.diginamic.banque.entites;

public class TestBanque {

    public static void main(String[] args) {

//        Compte monCompte = new Compte("145482521P", 400.94);

        Compte[] tableaudeComptes = {new Compte("145482521P", 400.94),
                new CompteTaux("185482521W", 4558.28, 2.5)
        };


        for(Compte compte : tableaudeComptes) {
            System.out.println(compte);
        }


    }
}
