package salaire;

public abstract class Employe {
	String prenom;
	String nom;
	int age;
	String dateEntreeService;
	double salaire;

	public Employe(String prenom, String nom, int age, String dateEntreeService, double salaire) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.dateEntreeService = dateEntreeService;
		this.salaire = salaire;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateEntreeService() {
		return dateEntreeService;
	}

	public void setDateEntreeService(String dateEntreeService) {
		this.dateEntreeService = dateEntreeService;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

}
