package controleur;

import java.util.ArrayList;
import java.util.Scanner;

import modele.ModeleEleve;
import vue.VueEleve;

public class C_Eleve {
    public static void insertEleve() {
        // instanciation de la classe Client
        Eleve unEleve = new Eleve();

        // saisir les donnÃ©es du client
        unEleve = VueEleve.saisirEleve();

        // insÃ©rer le client dans la BDD
        ModeleEleve.insertEleve(unEleve);

        System.out.println("Insertion de l'élève réussie");
    }

    public static void updateEleve() {
        // saisir l'id du client Ã  modifier
        Scanner sc = new Scanner(System.in);
        int idEleve;
        System.out.println("Donner l'id de l'élève à modifier :");
        idEleve = sc.nextInt();

        // rÃ©cupÃ©rer le client dans la BDD avec cet id
        Eleve unEleve = ModeleEleve.selectWhereEleve(idEleve);

        // modifier les infos du client
        unEleve = VueEleve.modifierEleve(unEleve);

        // actualiser le client dans la BDD
        ModeleEleve.updateEleve(unEleve);

        System.out.println("Modification de l'élève réussie");
    }

    public static void deleteEleve() {
        // saisir l'id du client Ã  supprimer
        Scanner sc = new Scanner(System.in);
        int idEleve;
        System.out.println("Donner l'id de l'élève à supprimer :");
        idEleve = sc.nextInt();

        // supprimer le client dans la BDD avec cet id
        ModeleEleve.deleteEleve(idEleve);

        System.out.println("Suppression de l'élève réussie");
    }

    public static void selectAllEleve() {
        ArrayList<Eleve> lesEleves;
        System.out.println("Liste des élèves :");

        // rÃ©cupÃ©rer tous les clients dans la BDD
        lesEleves = ModeleEleve.selectAllEleve();

        // on parcourt l'ArrayList
        for (Eleve unEleve : lesEleves) {
            // afficher le client
            VueEleve.afficherEleve(unEleve);
        }
    }

    public static void menuEleve() {
        int choix = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("______Menu Élève______");
            System.out.println("1- Ajouter un élève");
            System.out.println("2- Lister les élèves");
            System.out.println("3- Modifier un élève");
            System.out.println("4- Supprimer un élève");
            System.out.println("0- Quitter");
            System.out.println("Votre choix :");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    insertEleve();
                    break;
                case 2:
                    selectAllEleve();
                    break;
                case 3:
                    updateEleve();
                    break;
                case 4:
                    deleteEleve();
                    break;
            }
        } while (choix != 0);
    }
}
