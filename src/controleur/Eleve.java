package controleur;

public class Eleve {
	private int id_e, id_formation;
	private String nom_e, prenom_e, datenai_e, adresse_e, ville_e, codepos_e,
			email_e, tel_e, sexe, dateinscrip_e, mdp_e;

	public Eleve(int id_e, String nom_e, String prenom_e,
			String datenai_e, String adresse_e, String ville_e, String codepos_e,
			String email_e, String tel_e, String sexe, String dateinscrip_e,
			String mdp_e, int id_formation) {
		this.id_e = id_e;
		this.id_formation = id_formation;
		this.nom_e = nom_e;
		this.prenom_e = prenom_e;
		this.datenai_e = datenai_e;
		this.adresse_e = adresse_e;
		this.ville_e = ville_e;
		this.codepos_e = codepos_e;
		this.email_e = email_e;
		this.tel_e = tel_e;
		this.sexe = sexe;
		this.dateinscrip_e = dateinscrip_e;
		this.mdp_e = mdp_e;
	}

	public Eleve(String nom_e, String prenom_e, String datenai_e, String ville_e, String adresse_e,
			String email_e, String mdp_e, String tel_e,
			String codepos_e, String dateinscrip_e, String sexe, int id_formation) {
		this.id_e = 0;
		this.nom_e = nom_e;
		this.prenom_e = prenom_e;
		this.datenai_e = datenai_e;
		this.ville_e = ville_e;
		this.adresse_e = adresse_e;
		this.email_e = email_e;
		this.mdp_e = mdp_e;
		this.tel_e = tel_e;
		this.codepos_e = codepos_e;
		this.dateinscrip_e = dateinscrip_e;
		this.sexe = sexe;
		this.id_formation = id_formation;
	}

	public Eleve() {
		this.id_e = 0;
		this.id_formation = 0;
		this.nom_e = "";
		this.prenom_e = "";
		this.datenai_e = "";
		this.adresse_e = "";
		this.ville_e = "";
		this.codepos_e = "";
		this.email_e = "";
		this.tel_e = "";
		this.sexe = "";
		this.dateinscrip_e = "";
		this.mdp_e = "";
	}

	public int getId_e() {
		return id_e;
	}

	public void setId_e(int id_e) {
		this.id_e = id_e;
	}

	public int getId_formation() {
		return id_formation;
	}

	public void setId_formation(int id_formation) {
		this.id_formation = id_formation;
	}

	public String getNom_e() {
		return nom_e;
	}

	public void setNom_e(String nom_e) {
		this.nom_e = nom_e;
	}

	public String getPrenom_e() {
		return prenom_e;
	}

	public void setPrenom_e(String prenom_e) {
		this.prenom_e = prenom_e;
	}

	public String getDatenai_e() {
		return datenai_e;
	}

	public void setDatenai_e(String datenai_e) {
		this.datenai_e = datenai_e;
	}

	public String getAdresse_e() {
		return adresse_e;
	}

	public void setAdresse_e(String adresse_e) {
		this.adresse_e = adresse_e;
	}

	public String getVille_e() {
		return ville_e;
	}

	public void setVille_e(String ville_e) {
		this.ville_e = ville_e;
	}

	public String getCodepos_e() {
		return codepos_e;
	}

	public void setCodepos_e(String codepos_e) {
		this.codepos_e = codepos_e;
	}

	public String getEmail_e() {
		return email_e;
	}

	public void setEmail_e(String email_e) {
		this.email_e = email_e;
	}

	public String getTel_e() {
		return tel_e;
	}

	public void setTel_e(String tel_e) {
		this.tel_e = tel_e;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getDateinscrip_e() {
		return dateinscrip_e;
	}

	public void setDateinscrip_e(String dateinscrip_e) {
		this.dateinscrip_e = dateinscrip_e;
	}

	public String getMdp_e() {
		return mdp_e;
	}

	public void setMdp_e(String mdp_e) {
		this.mdp_e = mdp_e;
	}

}
