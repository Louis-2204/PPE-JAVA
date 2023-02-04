package controleur;

import java.util.ArrayList;
import java.util.Scanner;
import modele.ModeleFormule;
import vue.VueFormule;

public class C_Formule {
    public static void insertFormule() {
        // instanciation de la classe Formule
        Formule uneFormule = new Formule();

        // saisir les données de la formule
        uneFormule = VueFormule.saisirFormule();

        // insérer la formule dans la BDD
        ModeleFormule.insertFormule(uneFormule);

        System.out.println("Insertion de la formule réussie");
    }

    public static void updateFormule() {
        // saisir l'id de la formule à modifier
        Scanner sc = new Scanner(System.in);
        int idFormule;
        System.out.println("Donner l'id de la formule à modifier :");
        idFormule = sc.nextInt();

        // récupérer la formule dans la BDD avec cet id
        Formule uneFormule = ModeleFormule.selectWhereFormule(idFormule);

        // modifier les infos de la formule
        uneFormule = VueFormule.modifierFormule(uneFormule);

        // actualiser la formule dans la BDD
        ModeleFormule.updateFormule(uneFormule);

        System.out.println("Modification de la formule réussie");
    }

    public static void deleteFormule() {
        // saisir l'id de la formule à supprimer
        Scanner sc = new Scanner(System.in);
        int idFormule;
        System.out.println("Donner l'id de la formule à supprimer :");
        idFormule = sc.nextInt();

        // supprimer la formule dans la BDD avec cet id
        ModeleFormule.deleteFormule(idFormule);

        System.out.println("Suppression de la formule réussie");
    }

    public static void selectAllFormule() {
        ArrayList<Formule> lesFormules;
        System.out.println("Liste des formules :");

        // récupérer tous les Formules dans la BDD
        lesFormules = ModeleFormule.selectAllFormule();

        // on parcourt la liste des formules
        for (Formule uneFormule : lesFormules) {
            // afficher les infos de la formule
            VueFormule.afficherFormule(uneFormule);
        }
    }
}
