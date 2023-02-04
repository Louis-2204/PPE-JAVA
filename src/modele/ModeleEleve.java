package modele;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Eleve;

public class ModeleEleve {
    private static Bdd uneBdd = new Bdd("localhost", "autoecole", "root", "");

    public static void insertEleve(Eleve unEleve) {
        String requete = "INSERT INTO eleve VALUES ( null,'"
                + unEleve.getNom_e() + "','"
                + unEleve.getPrenom_e() + "','"
                + unEleve.getDatenai_e() + "','"
                + unEleve.getAdresse_e() + "','"
                + unEleve.getVille_e() + "','"
                + unEleve.getCodepos_e() + "','"
                + unEleve.getEmail_e() + "','"
                + unEleve.getTel_e() + "','"
                + unEleve.getSexe() + "','"
                + unEleve.getDateinscrip_e() + "','"
                + unEleve.getMdp_e() + "','"
                + unEleve.getId_formation() + "');";
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

    public static void updateEleve(Eleve unEleve) {
        String requete = "UPDATE eleve SET"
                + " nom_e = '" + unEleve.getNom_e() + "',"
                + " prenom_e = '" + unEleve.getPrenom_e() + "',"
                + " datenai_e = '" + unEleve.getDatenai_e() + "',"
                + " adresse_e = '" + unEleve.getAdresse_e() + "',"
                + " ville_e = '" + unEleve.getVille_e() + "',"
                + " codepos_e = '" + unEleve.getCodepos_e() + "',"
                + " email_e = '" + unEleve.getEmail_e() + "',"
                + " tel_e = '" + unEleve.getTel_e() + "',"
                + " sexe = '" + unEleve.getSexe() + "',"
                + " dateinscrip_e = '" + unEleve.getDateinscrip_e() + "',"
                + " mdp_e = '" + unEleve.getMdp_e() + "',"
                + " id_formation = '" + unEleve.getId_formation() + "'"
                + " WHERE id_e = " + unEleve.getId_e() + ";";
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

    public static void deleteEleve(int id_e) {
        String requete = "DELETE FROM eleve WHERE ideleve = " + id_e + ";";
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

    public static ArrayList<Eleve> selectAllEleve() {
        ArrayList<Eleve> lesEleves = new ArrayList<Eleve>();
        String requete = "SELECT * FROM eleve;";
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaConnexion().createStatement();
            // rÃ©cupÃ©ration des rÃ©sultats
            java.sql.ResultSet desResultats = unStat.executeQuery(requete);
            // on parcourt les rÃ©sultats et on instancie les Clients
            while (desResultats.next()) {
                Eleve unEleve = new Eleve(
                        desResultats.getInt("id_e"),
                        desResultats.getString("nom_e"),
                        desResultats.getString("prenom_e"),
                        desResultats.getString("datenai_e"),
                        desResultats.getString("adresse_e"),
                        desResultats.getString("ville_e"),
                        desResultats.getString("codepos_e"),
                        desResultats.getString("email_e"),
                        desResultats.getString("tel_e"),
                        desResultats.getString("sexe"),
                        desResultats.getString("dateinscrip_e"),
                        desResultats.getString("mdp_e"),
                        desResultats.getInt("id_formation"));
                // on ajoute le Client dans l'ArrayList
                lesEleves.add(unEleve);
            }
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur d'execution de la requete : " + requete);
        }
        return lesEleves;
    }

    public static Eleve selectWhereEleve(int id_e) {
        Eleve unEleve = null;
        String requete = "SELECT * FROM eleve WHERE id_e = " + id_e + ";";
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaConnexion().createStatement();
            // rÃ©cupÃ©ration du Client
            java.sql.ResultSet unResultat = unStat.executeQuery(requete);
            // on teste si le Client existe
            if (unResultat.next()) {
                unEleve = new Eleve(
                        unResultat.getInt("id_e"),
                        unResultat.getString("nom_e"),
                        unResultat.getString("prenom_e"),
                        unResultat.getString("datenai_e"),
                        unResultat.getString("adresse_e"),
                        unResultat.getString("ville_e"),
                        unResultat.getString("codepos_e"),
                        unResultat.getString("email_e"),
                        unResultat.getString("tel_e"),
                        unResultat.getString("sexe"),
                        unResultat.getString("dateinscrip_e"),
                        unResultat.getString("mdp_e"),
                        unResultat.getInt("id_formation"));
            }
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur d'execution de la requete : " + requete);
        }
        return unEleve;
    }
}
