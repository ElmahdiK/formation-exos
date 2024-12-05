package salaire;

public class Salesman extends Employe {

	public Salesman(String prenom, String nom, int age, String dateEntreeService, double salaire) {
		super(prenom, nom, age, dateEntreeService, salaire);
		// TODO Auto-generated constructor stub
	}

	public double getSalaire() {
		return (salaire * 0.2) + 400;
	}

}
