package controleur;

import java.util.ArrayList;
import java.util.Scanner;

import vue.VueMoniteur;
import modele.ModeleMoniteur;

public class C_Moniteur {
    public static void insertMoniteur() {
        // instanciation de la classe Moniteur
        Moniteur unMoniteur = new Moniteur();

        // saisir les données du moniteur
        unMoniteur = VueMoniteur.saisirMoniteur();

        // insérer le moniteur dans la BDD
        ModeleMoniteur.insertMoniteur(unMoniteur);

        System.out.println("Insertion du moniteur réussie");
    }

    public static void updateMoniteur() {
        // saisir l'id du moniteur à modifier
        Scanner sc = new Scanner(System.in);
        int idMoniteur;
        System.out.println("Donner l'id du moniteur à modifier :");
        idMoniteur = sc.nextInt();

        // récupérer le moniteur dans la BDD avec cet id
        Moniteur unMoniteur = ModeleMoniteur.selectWhereMoniteur(idMoniteur);

        // modifier les infos du moniteur
        unMoniteur = VueMoniteur.modifierMoniteur(unMoniteur);

        // actualiser le moniteur dans la BDD
        ModeleMoniteur.updateMoniteur(unMoniteur);

        System.out.println("Modification du moniteur réussie");
    }

    public static void deleteMoniteur() {
        // saisir l'id du moniteur à supprimer
        Scanner sc = new Scanner(System.in);
        int idMoniteur;
        System.out.println("Donner l'id du moniteur à supprimer :");
        idMoniteur = sc.nextInt();

        // supprimer le moniteur dans la BDD avec cet id
        ModeleMoniteur.deleteMoniteur(idMoniteur);

        System.out.println("Suppression du moniteur réussie");
    }

    public static void selectAllMoniteur() {
        ArrayList<Moniteur> lesMoniteurs;
        System.out.println("Liste des moniteurs :");

        // récupérer tous les Moniteurs dans la BDD
        lesMoniteurs = ModeleMoniteur.selectAllMoniteur();

        // on parcourt l'ArrayList
        for (Moniteur unMoniteur : lesMoniteurs) {
            // afficher le Moniteur
            VueMoniteur.afficherMoniteur(unMoniteur);
        }
    }

    public static void menuMoniteur() {
        int choix = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("______Menu Moniteur______");
            System.out.println("1- Ajouter un moniteur");
            System.out.println("2- Lister les moniteurs");
            System.out.println("3- Modifier un moniteur");
            System.out.println("4- Supprimer un moniteur");
            System.out.println("0- Quitter");
            System.out.println("Votre choix :");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    insertMoniteur();
                    break;
                case 2:
                    selectAllMoniteur();
                    break;
                case 3:
                    updateMoniteur();
                    break;
                case 4:
                    deleteMoniteur();
                    break;
            }
        } while (choix != 0);
    }
}
