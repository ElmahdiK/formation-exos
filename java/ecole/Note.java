package ecole;

public class Note {
	double note;
	String commentaire;
	Matiere matiere;

	public Note(double note, String commentaire, Matiere matiere) {
		super();
		this.note = note;
		this.commentaire = commentaire;
		if (matiere == null)
			throw new IllegalArgumentException("Veuillez saisir une matière");
		else
			this.matiere = matiere;
	}

	public double getNote() {
		return note;
	}

}
