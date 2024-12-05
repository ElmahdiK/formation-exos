package ecole;

public class Matiere {
	String nom;
	int coefficient;

	public Matiere(String nom, int coefficient) {
		super();
		this.nom = nom;
		this.coefficient = coefficient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

}
