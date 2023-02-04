package controleur;

public class Moniteur {
    private int id_m;
    private String nom_m, prenom_m, dateembauche_m, adresse_m, dateobtentionBAFM, codpos_m, tel_m, mdp_m,
            email_m, ville_m;

    public Moniteur(int id_m, String nom_m, String prenom_m, String dateembauche_m, String adresse_m,
            String dateobtentionBAFM, String codpos_m, String tel_m, String mdp_m, String email_m, String ville_m) {
        this.id_m = id_m;
        this.nom_m = nom_m;
        this.prenom_m = prenom_m;
        this.dateembauche_m = dateembauche_m;
        this.adresse_m = adresse_m;
        this.dateobtentionBAFM = dateobtentionBAFM;
        this.codpos_m = codpos_m;
        this.tel_m = tel_m;
        this.mdp_m = mdp_m;
        this.email_m = email_m;
        this.ville_m = ville_m;
    }

    public Moniteur(String nom_m, String prenom_m, String dateembauche_m, String adresse_m,
            String dateobtentionBAFM, String codpos_m, String tel_m, String mdp_m, String email_m, String ville_m) {
        this.id_m = 0;
        this.nom_m = nom_m;
        this.prenom_m = prenom_m;
        this.dateembauche_m = dateembauche_m;
        this.adresse_m = adresse_m;
        this.dateobtentionBAFM = dateobtentionBAFM;
        this.codpos_m = codpos_m;
        this.tel_m = tel_m;
        this.mdp_m = mdp_m;
        this.email_m = email_m;
        this.ville_m = ville_m;
    }

    public Moniteur() {
        this.id_m = 0;
        this.nom_m = "";
        this.prenom_m = "";
        this.dateembauche_m = "";
        this.adresse_m = "";
        this.dateobtentionBAFM = "";
        this.codpos_m = "";
        this.tel_m = "";
        this.mdp_m = "";
        this.email_m = "";
        this.ville_m = "";
    }

    public int getId_m() {
        return this.id_m;
    }

    public void setId_m(int id_m) {
        this.id_m = id_m;
    }

    public String getNom_m() {
        return this.nom_m;
    }

    public void setNom_m(String nom_m) {
        this.nom_m = nom_m;
    }

    public String getPrenom_m() {
        return this.prenom_m;
    }

    public void setPrenom_m(String prenom_m) {
        this.prenom_m = prenom_m;
    }

    public String getDateembauche_m() {
        return this.dateembauche_m;
    }

    public void setDateembauche_m(String dateembauche_m) {
        this.dateembauche_m = dateembauche_m;
    }

    public String getAdresse_m() {
        return this.adresse_m;
    }

    public void setAdresse_m(String adresse_m) {
        this.adresse_m = adresse_m;
    }

    public String getDateobtentionBAFM() {
        return this.dateobtentionBAFM;
    }

    public void setDateobtentionBAFM(String dateobtentionBAFM) {
        this.dateobtentionBAFM = dateobtentionBAFM;
    }

    public String getCodpos_m() {
        return this.codpos_m;
    }

    public void setCodpos_m(String codpos_m) {
        this.codpos_m = codpos_m;
    }

    public String getTel_m() {
        return this.tel_m;
    }

    public void setTel_m(String tel_m) {
        this.tel_m = tel_m;
    }

    public String getMdp_m() {
        return this.mdp_m;
    }

    public void setMdp_m(String mdp_m) {
        this.mdp_m = mdp_m;
    }

    public String getEmail_m() {
        return this.email_m;
    }

    public void setEmail_m(String email_m) {
        this.email_m = email_m;
    }

    public String getVille_m() {
        return this.ville_m;
    }

    public void setVille_m(String ville_m) {
        this.ville_m = ville_m;
    }

}
