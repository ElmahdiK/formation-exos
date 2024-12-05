package ecole;

import java.util.ArrayList;

import ecole.Eleve.AucuneNoteException;

public class ClasseEcole {
	String nom;
	ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();
	double moyenneGenerale = 0;
	double moyenneMax = 0;
	Eleve superEleve;

	public ClasseEcole(String nom) {
		super();
		this.nom = nom;
	}

	public void ajouterEleve(Eleve eleve) {
		listeEleves.add(eleve);
	}

	// retourne la moyenne générale de la classe en tenant compte des coefficients
	// des matières.
	public double calculerMoyenneClasse() {
		listeEleves.forEach(eleve -> {
			try {
				moyenneGenerale += eleve.calculerMoyenne();
			} catch (AucuneNoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		return moyenneGenerale / listeEleves.size();
	}

	// retourne l'élève ayant la meilleure moyenne générale.
	public Eleve trouverMeilleurEleve() {
		listeEleves.forEach(eleve -> {
			eleve.getListeNotes().forEach(note -> {
				try {
					if (eleve.calculerMoyenne() > moyenneMax) {
						moyenneMax = eleve.calculerMoyenne();
						superEleve = eleve;
					}
				} catch (AucuneNoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		});
		return superEleve;
	}

	// affiche pour chaque élève ses notes par matière, sa moyenne générale, et une
	// appréciation.
	public void afficherBulletins() {
		listeEleves.forEach(eleve -> {
			eleve.getListeNotes().forEach(note -> {
				System.out.println("L'élève " + eleve.getNom() + " a eu " + note.note + " en " + note.matiere.nom
						+ " => " + note.commentaire);
			});
			try {
				System.out.println(
						"L'élève " + eleve.getNom() + " a eu " + eleve.calculerMoyenne() + " de moyenne générale.\n");
			} catch (AucuneNoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}
