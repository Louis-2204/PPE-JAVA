package vue;

import java.util.Scanner;

import controleur.Moniteur;

public class VueMoniteur {
    public static Moniteur saisirMoniteur() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le nom du moniteur : ");
        String nom_m = sc.nextLine();
        System.out.println("Saisir le prenom du moniteur : ");
        String prenom_m = sc.nextLine();
        System.out.println("Saisir la date d'embauche du moniteur : ");
        String dateembauche_m = sc.nextLine();
        System.out.println("Saisir l'adresse du moniteur : ");
        String adresse_m = sc.nextLine();
        System.out.println("Saisir la date d'obtention du BAFM du moniteur : ");
        String dateobtentionBAFM = sc.nextLine();
        System.out.println("Saisir le code postal du moniteur : ");
        String codpos_m = sc.nextLine();
        System.out.println("Saisir le numero de telephone du moniteur : ");
        String tel_m = sc.nextLine();
        System.out.println("Saisir le mot de passe du moniteur : ");
        String mdp_m = sc.nextLine();
        System.out.println("Saisir l'email du moniteur : ");
        String email_m = sc.nextLine();
        System.out.println("Saisir la ville du moniteur : ");
        String ville_m = sc.nextLine();

        // instanciation de la classe Moniteur
        Moniteur moniteur = new Moniteur(nom_m, prenom_m, dateembauche_m, adresse_m, dateobtentionBAFM, codpos_m, tel_m,
                mdp_m, email_m, ville_m);
        return moniteur;
    }

    public static void afficherMoniteur(Moniteur moniteur) {
        System.out.println("Id du moniteur : " + moniteur.getId_m());
        System.out.println("Nom du moniteur : " + moniteur.getNom_m());
        System.out.println("Prenom du moniteur : " + moniteur.getPrenom_m());
        System.out.println("Date d'embauche du moniteur : " + moniteur.getDateembauche_m());
        System.out.println("Adresse du moniteur : " + moniteur.getAdresse_m());
        System.out.println("Date d'obtention du BAFM du moniteur : " + moniteur.getDateobtentionBAFM());
        System.out.println("Code postal du moniteur : " + moniteur.getCodpos_m());
        System.out.println("Numero de telephone du moniteur : " + moniteur.getTel_m());
        System.out.println("Mot de passe du moniteur : " + moniteur.getMdp_m());
        System.out.println("Email du moniteur : " + moniteur.getEmail_m());
        System.out.println("Ville du moniteur : " + moniteur.getVille_m());
    }

    public static Moniteur modifierMoniteur(Moniteur unMoniteur) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ancien nom du moniteur : " + unMoniteur.getNom_m());
        System.out.println("Nouveau nom du moniteur : ");
        unMoniteur.setNom_m(sc.nextLine());

        System.out.println("Ancien prenom du moniteur : " + unMoniteur.getPrenom_m());
        System.out.println("Nouveau prenom du moniteur : ");
        unMoniteur.setPrenom_m(sc.nextLine());

        System.out.println("Ancienne date d'embauche du moniteur : " + unMoniteur.getDateembauche_m());
        System.out.println("Nouvelle date d'embauche du moniteur : ");
        unMoniteur.setDateembauche_m(sc.nextLine());

        System.out.println("Ancienne adresse du moniteur : " + unMoniteur.getAdresse_m());
        System.out.println("Nouvelle adresse du moniteur : ");
        unMoniteur.setAdresse_m(sc.nextLine());

        System.out.println("Ancienne date d'obtention du BAFM du moniteur : " + unMoniteur.getDateobtentionBAFM());
        System.out.println("Nouvelle date d'obtention du BAFM du moniteur : ");
        unMoniteur.setDateobtentionBAFM(sc.nextLine());

        System.out.println("Ancien code postal du moniteur : " + unMoniteur.getCodpos_m());
        System.out.println("Nouveau code postal du moniteur : ");
        unMoniteur.setCodpos_m(sc.nextLine());

        System.out.println("Ancien numero de telephone du moniteur : " + unMoniteur.getTel_m());
        System.out.println("Nouveau numero de telephone du moniteur : ");
        unMoniteur.setTel_m(sc.nextLine());

        System.out.println("Ancien mot de passe du moniteur : " + unMoniteur.getMdp_m());
        System.out.println("Nouveau mot de passe du moniteur : ");
        unMoniteur.setMdp_m(sc.nextLine());

        System.out.println("Ancien email du moniteur : " + unMoniteur.getEmail_m());
        System.out.println("Nouvel email du moniteur : ");
        unMoniteur.setEmail_m(sc.nextLine());

        System.out.println("Ancienne ville du moniteur : " + unMoniteur.getVille_m());
        System.out.println("Nouvelle ville du moniteur : ");
        unMoniteur.setVille_m(sc.nextLine());

        return unMoniteur;
    }
}
