package controleur;

import java.util.Scanner;

public class PPE {

	public static void main(String[] args) {

		int choix = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("______Menu Auto-École______");
			System.out.println("1- Gestion des élèves");
			System.out.println("2- Gestion des moniteurs");
			System.out.println("3- Gestion des véhicules");
			System.out.println("4- Gestion des formules");
			System.out.println("0- Quitter");
			System.out.println("Votre choix :");
			choix = sc.nextInt();
			switch (choix) {
				case 1:
					C_Eleve.menuEleve();
					break;
				case 2:
					C_Moniteur.menuMoniteur();
					break;
				case 3:
					C_Vehicule.menuVehicule();
					break;
				case 4:
					break;
			}
		} while (choix != 0);
	}
}
