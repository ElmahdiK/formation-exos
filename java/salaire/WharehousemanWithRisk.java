package salaire;

public class WharehousemanWithRisk extends Wharehouseman {

	public WharehousemanWithRisk(String prenom, String nom, int age, String dateEntreeService, int salaire) {
		super(prenom, nom, age, dateEntreeService, salaire);
		// TODO Auto-generated constructor stub
	}

	public double getSalaire() {
		return super.getSalaire() + 200;
	}

}
