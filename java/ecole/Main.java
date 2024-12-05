package ecole;

import ecole.Eleve.AucuneNoteException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Définition de la classe Ecole
		ClasseEcole classeEcole = new ClasseEcole("Orange Star High School");

		// Définition des matières avec coeff
		Matiere math = new Matiere("math", 10);
		Matiere histoire = new Matiere("histoire", 4);
		Matiere art = new Matiere("art", 2);

		// Définition des élèves
		Eleve trunks = new Eleve("Trunks");
		Eleve goten = new Eleve("Goten");
		Eleve gohan = new Eleve("Gohan");

		// ajout des élèves dans la classe
		classeEcole.ajouterEleve(trunks);
		classeEcole.ajouterEleve(goten);
		classeEcole.ajouterEleve(gohan);

		// ajout des notes pour l'élève
		// - trunks
		trunks.ajouterNote(new Note(20, "très bien", math));
		trunks.ajouterNote(new Note(0, "pas bien", histoire));
		// - goten
		goten.ajouterNote(new Note(15, "bien", histoire));
		goten.ajouterNote(new Note(20, "très bien", art));
		// - gohan
		gohan.ajouterNote(new Note(20, "très bien", math));
		gohan.ajouterNote(new Note(20, "très bien", histoire));
		gohan.ajouterNote(new Note(20, "très bien", art));

		// calcul de la moyenne pour l'élève
		try {
			System.out.println("Calcul moyenne = ");
			// - trunks
			System.out.println(trunks.getNom() + " : " + trunks.calculerMoyenne());
			// - goten
			System.out.println(goten.getNom() + " : " + goten.calculerMoyenne());
			// - gohan
			System.out.println(gohan.getNom() + " : " + gohan.calculerMoyenne());
		} catch (AucuneNoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// afficher le bulletin pour chaque élève
		System.out.println("\nBulletins :");
		classeEcole.afficherBulletins();

		// calculer la moyenne de la classe
		System.out.println("\nMoyenne de la classe => " + classeEcole.calculerMoyenneClasse());

		// trouver meilleur élève
		System.out.println("\nMeilleur élève de la classe => " + classeEcole.trouverMeilleurEleve().getNom());
	}

}
