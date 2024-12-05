package salaire;

import java.util.ArrayList;
import java.util.List;

public class Staff {
	ArrayList<Employe> listEmployes = new ArrayList<Employe>();
	double sumSalaire = 0;

	public void add(Employe employe) {
		this.listEmployes.add(employe);
	}

	public void displaySalaries() {
		listEmployes.forEach(employe -> {
			System.out.println("L'employé " + employe.getPrenom() + " " + employe.getNom() + " a un salaire de "
					+ (int) employe.getSalaire() + " €");
		});
	}

	public void displayAverageSalary() {
		listEmployes.forEach(employe -> {
			sumSalaire += employe.getSalaire();
		});
		System.out.println("Valeur du salaire moyen : " + sumSalaire / listEmployes.size() + " €");
	}
}
