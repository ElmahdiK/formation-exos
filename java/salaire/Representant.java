package salaire;

public class Representant extends Employe {

	public Representant(String prenom, String nom, int age, String dateEntreeService, int salaire) {
		super(prenom, nom, age, dateEntreeService, salaire);
		// TODO Auto-generated constructor stub
	}

	public double getSalaire() {
		return (salaire * 0.2) + 800;
	}
}
