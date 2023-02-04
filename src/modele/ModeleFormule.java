package modele;

import controleur.Formule;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeleFormule {
    private static Bdd uneBdd = new Bdd("localhost", "autoecole", "root", "");

    public static void insertFormule(Formule uneFormule) {

        if (uneFormule.getType_boite() == "null") {
            String req = "INSERT INTO formule values(null,'"
                    + uneFormule.getNom_f() + "',"
                    + uneFormule.getPrix_f() + ","
                    + uneFormule.getNb_heures() + ","
                    + "null)";
            try {
                uneBdd.seConnecter();
                Statement unStat = uneBdd.getMaConnexion().createStatement();
                unStat.execute(req);
                unStat.close();
                uneBdd.seDeconnecter();
            } catch (SQLException exp) {
                System.out.println("Erreur d'execution de la requete : " + req);
            }
        } else {
            String req = "INSERT INTO formule values(null,'"
                    + uneFormule.getNom_f() + "',"
                    + uneFormule.getPrix_f() + ","
                    + uneFormule.getNb_heures() + ",'"
                    + uneFormule.getType_boite() + "')";
            try {
                uneBdd.seConnecter();
                Statement unStat = uneBdd.getMaConnexion().createStatement();
                unStat.execute(req);
                unStat.close();
                uneBdd.seDeconnecter();
            } catch (SQLException exp) {
                System.out.println("Erreur d'execution de la requete : " + req);
            }
        }
    }

    public static void updateFormule(Formule uneFormule) {
        String req = "UPDATE formule SET "
                + "nom_f = '" + uneFormule.getNom_f() + "',"
                + "prix_f = " + uneFormule.getPrix_f() + ","
                + "nb_heures = " + uneFormule.getNb_heures() + ","
                + "type_boite = '" + uneFormule.getType_boite() + "'"
                + "WHERE id_f = " + uneFormule.getId_f() + ";";
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaConnexion().createStatement();
            unStat.execute(req);
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur d'execution de la requete : " + req);
        }
    }

    public static void deleteFormule(int id_f) {
        String req = "DELETE FROM formule WHERE id_f = " + id_f + ";";
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaConnexion().createStatement();
            unStat.execute(req);
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur d'execution de la requete : " + req);
        }
    }

    public static ArrayList<Formule> selectAllFormule() {
        ArrayList<Formule> lesFormules = new ArrayList<Formule>();
        String req = "SELECT * FROM formule;";
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaConnexion().createStatement();
            // récupération des résultats
            java.sql.ResultSet desResultats = unStat.executeQuery(req);
            // on parcours les résultats et on instancie les Formules
            while (desResultats.next()) {
                Formule uneFormule = new Formule(desResultats.getInt("id_f"),
                        desResultats.getString("nom_f"),
                        desResultats.getFloat("prix_f"),
                        desResultats.getFloat("nb_heures"),
                        desResultats.getString("type_boite"));
                // on ajoute la Formule dans l'arrayList
                lesFormules.add(uneFormule);
            }
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur d'execution de la requete : " + req);
        }
        return lesFormules;
    }

    public static Formule selectWhereFormule(int id_f) {
        Formule uneFormule = null;
        String req = "SELECT * FROM formule WHERE id_f = " + id_f + ";";
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaConnexion().createStatement();
            // récupération de la formule
            java.sql.ResultSet unResultat = unStat.executeQuery(req);
            // on parcours les résultats et on instancie les Formules
            if (unResultat.next()) {
                uneFormule = new Formule(unResultat.getInt("id_f"),
                        unResultat.getString("nom_f"),
                        unResultat.getFloat("prix_f"),
                        unResultat.getFloat("nb_heures"),
                        unResultat.getString("type_boite"));
            }
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur d'execution de la requete : " + req);
        }
        return uneFormule;
    }

}
