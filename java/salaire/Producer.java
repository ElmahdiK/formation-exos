package salaire;

public class Producer extends Employe {

	public Producer(String prenom, String nom, int age, String dateEntreeService, int salaire) {
		super(prenom, nom, age, dateEntreeService, salaire);
		// TODO Auto-generated constructor stub
	}

	public double getSalaire() {
		return salaire * 5;
	}

}
