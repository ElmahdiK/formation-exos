package geometrie;

public class CalculateurGeometrique {

	// calcule l’aire totale d'un tableau de Forme
	static double aireTotale(Forme[] formes) {
		double sumAires = 0;
		for (Forme forme : formes)
			sumAires += forme.calculerAire();
		return sumAires;
	}

	// calcule le périmètre total d'un tableau de Forme
	static double perimetreTotal(Forme[] formes) {
		double sumPerimetre = 0;
		for (Forme forme : formes)
			sumPerimetre += forme.calculerPerimetre();
		return sumPerimetre;
	}
}
