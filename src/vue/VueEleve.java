package vue;

import java.util.Scanner;

import controleur.Eleve;

public class VueEleve {
    public static Eleve saisirEleve() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nom de l'eleve :");
        String nom_e = sc.next();
        System.out.println("Donner le prenom de l'eleve :");
        String prenom_e = sc.next();
        System.out.println("Donner la date de naissance de l'eleve :");
        String datenai_e = sc.next();
        System.out.println("Donner l'adresse de l'eleve :");
        String adresse_e = sc.next();
        System.out.println("Donner la ville de l'eleve :");
        String ville_e = sc.next();
        System.out.println("Donner le code postal de l'eleve :");
        String codepos_e = sc.next();
        System.out.println("Donner l'email de l'eleve :");
        String email_e = sc.next();
        System.out.println("Donner le numero de telephone de l'eleve :");
        String tel_e = sc.next();
        System.out.println("Donner le sexe de l'eleve :");
        String sexe = sc.next();
        System.out.println("Donner la date d'inscription de l'eleve :");
        String dateinscrip_e = sc.next();
        System.out.println("Donner le mot de passe de l'eleve :");
        String mdp_e = sc.next();
        System.out.println("Donner l'id de la formation de l'eleve :");
        int id_formation = sc.nextInt();
        Eleve unEleve = new Eleve(nom_e, prenom_e,
                datenai_e, ville_e, adresse_e, email_e, mdp_e, tel_e,
                codepos_e, dateinscrip_e, sexe, id_formation);
        return unEleve;
    }

    public static void afficherEleve(Eleve unEleve) {
        System.out.println("Nom de l'eleve : " + unEleve.getNom_e());
        System.out.println("Prenom de l'eleve : " + unEleve.getPrenom_e());
        System.out.println("Date de naissance de l'eleve : " + unEleve.getDatenai_e());
        System.out.println("Adresse de l'eleve : " + unEleve.getAdresse_e());
        System.out.println("Ville de l'eleve : " + unEleve.getVille_e());
        System.out.println("Code postal de l'eleve : " + unEleve.getCodepos_e());
        System.out.println("Email de l'eleve : " + unEleve.getEmail_e());
        System.out.println("Numero de telephone de l'eleve : " + unEleve.getTel_e());
        System.out.println("Sexe de l'eleve : " + unEleve.getSexe());
        System.out.println("Date d'inscription de l'eleve : " + unEleve.getDateinscrip_e());
        System.out.println("Mot de passe de l'eleve : " + unEleve.getMdp_e());
        System.out.println("Id de la formation de l'eleve : " + unEleve.getId_formation());
    }

    public static Eleve modifierEleve(Eleve unEleve) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ancien nom de l'eleve : " + unEleve.getNom_e());
        System.out.println("Donner le nouveau nom de l'eleve :");
        String nom_e = sc.next();

        System.out.println("Ancien prenom de l'eleve : " + unEleve.getPrenom_e());
        System.out.println("Donner le nouveau prenom de l'eleve :");
        String prenom_e = sc.next();

        System.out.println("Ancienne date de naissance de l'eleve : " + unEleve.getDatenai_e());
        System.out.println("Donner la nouvelle date de naissance de l'eleve :");
        String datenai_e = sc.next();

        System.out.println("Ancienne adresse de l'eleve : " + unEleve.getAdresse_e());
        System.out.println("Donner la nouvelle adresse de l'eleve :");
        String adresse_e = sc.next();

        System.out.println("Ancienne ville de l'eleve : " + unEleve.getVille_e());
        System.out.println("Donner la nouvelle ville de l'eleve :");
        String ville_e = sc.next();

        System.out.println("Ancien code postal de l'eleve : " + unEleve.getCodepos_e());
        System.out.println("Donner le nouveau code postal de l'eleve :");
        String codepos_e = sc.next();

        System.out.println("Ancien email de l'eleve : " + unEleve.getEmail_e());
        System.out.println("Donner le nouveau email de l'eleve :");
        String email_e = sc.next();

        System.out.println("Ancien numero de telephone de l'eleve : " + unEleve.getTel_e());
        System.out.println("Donner le nouveau numero de telephone de l'eleve :");
        String tel_e = sc.next();

        System.out.println("Ancien sexe de l'eleve : " + unEleve.getSexe());
        System.out.println("Donner le nouveau sexe de l'eleve :");
        String sexe = sc.next();

        System.out.println("Ancienne date d'inscription de l'eleve : " + unEleve.getDateinscrip_e());
        System.out.println("Donner la nouvelle date d'inscription de l'eleve :");
        String dateinscrip_e = sc.next();

        System.out.println("Ancien mot de passe de l'eleve : " + unEleve.getMdp_e());
        System.out.println("Donner le nouveau mot de passe de l'eleve :");
        String mdp_e = sc.next();

        System.out.println("Ancien id de la formation de l'eleve : " + unEleve.getId_formation());
        System.out.println("Donner le nouveau id de la formation de l'eleve :");
        int id_formation = sc.nextInt();

        return unEleve;
    }
}
