package controleur;

import java.util.ArrayList;
import java.util.Scanner;

import modele.ModeleVehicule;
import vue.VueVehicule;

public class C_Vehicule {
    public static void insertVehicule() {
        // instanciation de la classe Client
        Vehicule unVehicule = new Vehicule();

        // saisir les donnÃ©es du client
        unVehicule = VueVehicule.saisirVehicule();

        // insÃ©rer le client dans la BDD
        ModeleVehicule.insertVehicule(unVehicule);

        System.out.println("Insertion du véhicule réussie");
    }

    public static void updateVehicule() {
        // saisir l'id du client Ã  modifier
        Scanner sc = new Scanner(System.in);
        int idVehicule;
        System.out.println("Donner l'id du véhicule à modifier :");
        idVehicule = sc.nextInt();

        // rÃ©cupÃ©rer le client dans la BDD avec cet id
        Vehicule unVehicule = ModeleVehicule.selectWhereVehicule(idVehicule);

        // modifier les infos du client
        unVehicule = VueVehicule.modifierVehicule(unVehicule);

        // actualiser le client dans la BDD
        ModeleVehicule.updateVehicule(unVehicule);

        System.out.println("Modification du véhicule réussie");
    }

    public static void deleteVehicule() {
        // saisir l'id du client Ã  supprimer
        Scanner sc = new Scanner(System.in);
        int idVehicule;
        System.out.println("Donner l'id du véhicule à supprimer :");
        idVehicule = sc.nextInt();

        // supprimer le client dans la BDD avec cet id
        ModeleVehicule.deleteVehicule(idVehicule);

        System.out.println("Suppression du véhicule réussie");
    }

    public static void selectAllVehicule() {
        ArrayList<Vehicule> lesVehicules;
        System.out.println("Liste des véhicules :");

        // rÃ©cupÃ©rer tous les clients dans la BDD
        lesVehicules = ModeleVehicule.selectAllVehicule();

        // on parcourt l'ArrayList
        for (Vehicule unVehicule : lesVehicules) {
            // afficher le client
            VueVehicule.afficherVehicule(unVehicule);
        }
    }

    public static void menuVehicule() {
        int choix = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("______Menu Véhicule______");
            System.out.println("1- Ajouter un véhicule");
            System.out.println("2- Lister les véhicules");
            System.out.println("3- Modifier un véhicule");
            System.out.println("4- Supprimer un véhicule");
            System.out.println("0- Quitter");
            System.out.println("Votre choix :");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    insertVehicule();
                    break;
                case 2:
                    selectAllVehicule();
                    break;
                case 3:
                    updateVehicule();
                    break;
                case 4:
                    deleteVehicule();
                    break;
            }
        } while (choix != 0);
    }
}
