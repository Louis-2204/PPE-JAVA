package modele;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Moniteur;

public class ModeleMoniteur {
    private static Bdd uneBdd = new Bdd("localhost", "autoecole", "root", "");

    public static void insertMoniteur(Moniteur unMoniteur) {
        String requete = "INSERT INTO client VALUES ( null,'"
                + unMoniteur.getNom_m() + "','"
                + unMoniteur.getPrenom_m() + "','"
                + unMoniteur.getDateembauche_m() + "','"
                + unMoniteur.getAdresse_m() + "','"
                + unMoniteur.getDateobtentionBAFM() + "','"
                + unMoniteur.getCodpos_m() + "','"
                + unMoniteur.getTel_m() + "','"
                + unMoniteur.getMdp_m() + "','"
                + unMoniteur.getEmail_m() + "','"
                + unMoniteur.getVille_m() + "');";
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaConnexion().createStatement();
            unStat.execute(requete);
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur d'execution de la requete : " + requete);
        }
    }

    public static void updateMoniteur(Moniteur unMoniteur) {
        String requete = "UPDATE client SET"
                + "nom_m = '" + unMoniteur.getNom_m() + "',"
                + "prenom_m = '" + unMoniteur.getPrenom_m() + "',"
                + "dateembauche_m = '" + unMoniteur.getDateembauche_m() + "',"
                + "adresse_m = '" + unMoniteur.getAdresse_m() + "',"
                + "dateobtentionBAFM = '" + unMoniteur.getDateobtentionBAFM() + "',"
                + "codpos_m = '" + unMoniteur.getCodpos_m() + "',"
                + "tel_m = '" + unMoniteur.getTel_m() + "',"
                + "mdp_m = '" + unMoniteur.getMdp_m() + "',"
                + "email_m = '" + unMoniteur.getEmail_m() + "',"
                + "ville_m = '" + unMoniteur.getVille_m() + "'"
                + "WHERE id_m = " + unMoniteur.getId_m() + ";";
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaConnexion().createStatement();
            unStat.execute(requete);
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur d'execution de la requete : " + requete);
        }
    }

    public static void deleteMoniteur(int idMoniteur) {
        String requete = "DELETE FROM moniteur WHERE id_m = " + idMoniteur + ";";
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaConnexion().createStatement();
            unStat.execute(requete);
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur d'execution de la requete : " + requete);
        }
    }

    public static ArrayList<Moniteur> selectAllMoniteur() {
        ArrayList<Moniteur> lesMoniteurs = new ArrayList<Moniteur>();
        String requete = "SELECT * FROM moniteur;";
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaConnexion().createStatement();
            // récupération des résultats
            java.sql.ResultSet desResultats = unStat.executeQuery(requete);
            // parcours des résultats et on instancie les Moniteurs
            while (desResultats.next()) {
                Moniteur unMoniteur = new Moniteur(desResultats.getInt("id_m"),
                        desResultats.getString("nom_m"),
                        desResultats.getString("prenom_m"),
                        desResultats.getString("dateembauche_m"),
                        desResultats.getString("adresse_m"),
                        desResultats.getString("dateobtentionBAFM"),
                        desResultats.getString("codpos_m"),
                        desResultats.getString("tel_m"),
                        desResultats.getString("mdp_m"),
                        desResultats.getString("email_m"),
                        desResultats.getString("ville_m"));
                // on ajoute le Moniteur instancié à la collection
                lesMoniteurs.add(unMoniteur);
            }
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur d'execution de la requete : " + requete);
        }
        return lesMoniteurs;
    }

    public static Moniteur selectWhereMoniteur(int id_m) {
        Moniteur unMoniteur = null;
        String requete = "SELECT * FROM moniteur WHERE id_m = " + id_m + ";";
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaConnexion().createStatement();
            // récupération du Moniteur
            java.sql.ResultSet unResultat = unStat.executeQuery(requete);
            // on teste si le Moniteur existe
            if (unResultat.next()) {
                unMoniteur = new Moniteur(unResultat.getInt("id_m"),
                        unResultat.getString("nom_m"),
                        unResultat.getString("prenom_m"),
                        unResultat.getString("dateembauche_m"),
                        unResultat.getString("adresse_m"),
                        unResultat.getString("dateobtentionBAFM"),
                        unResultat.getString("codpos_m"),
                        unResultat.getString("tel_m"),
                        unResultat.getString("mdp_m"),
                        unResultat.getString("email_m"),
                        unResultat.getString("ville_m"));
            }
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur d'execution de la requete : " + requete);
        }
        return unMoniteur;
    }
}
