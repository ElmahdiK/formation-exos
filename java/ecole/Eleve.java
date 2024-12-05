package ecole;

import java.util.ArrayList;

public class Eleve {
	String nom;
	ArrayList<Note> listeNotes = new ArrayList<Note>();
	double sum = 0;
	double sumCoeff = 0;

	public Eleve(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Note> getListeNotes() {
		return listeNotes;
	}

	public void ajouterNote(Note note) {
		if (note.getNote() < 0)
			note.note = 0;
		else if (note.getNote() > 20)
			note.note = 20;
		this.listeNotes.add(note);
	}

	public class AucuneNoteException extends Exception {
		public AucuneNoteException(String errorMessage) {
			super(errorMessage);
		}
	}

	public double calculerMoyenne() throws AucuneNoteException {
		if (listeNotes.size() == 0)
			throw new AucuneNoteException("Aucune note pour cet élève.");
		else {
			listeNotes.forEach(note -> {
				this.sum += note.getNote() * note.matiere.getCoefficient();
				this.sumCoeff += note.matiere.getCoefficient();
			});
			// return this.sum / listeNotes.size();
			return this.sum / this.sumCoeff;
		}
	}
}
