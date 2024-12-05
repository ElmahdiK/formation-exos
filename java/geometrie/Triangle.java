package geometrie;

public class Triangle extends Forme implements Transformable {
	double coteA;
	double coteB;
	double coteC;

	public Triangle(double coteA, double coteB, double coteC) {
		super();
		this.coteA = coteA;
		this.coteB = coteB;
		this.coteC = coteC;
	}

	// triangles isocèles : deux côtés égaux et un côté différent
	public Triangle(double coteA, double coteC) {
		this(coteA, coteA, coteC);
	}

	@Override
	public double calculerAire() {
		// TODO Auto-generated method stub

		// (coteA+coteB+coteC)/2
		double s = (this.coteA + this.coteB + this.coteC) / 2;

		// racine(s*(s-coteA)*(s-coteB)*(s-coteC))
		return Math.sqrt(s * (s - this.coteA) * (s - this.coteB) * (s - this.coteC));
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub

		// coteA+coteB+coteC
		return this.coteA + this.coteB + this.coteC;
	}

	@Override
	public void agrandir(double facteur) {
		// TODO Auto-generated method stub
		this.coteA = this.coteA * facteur;
		this.coteB = this.coteB * facteur;
		this.coteC = this.coteC * facteur;
	}

	@Override
	public void reduire(double facteur) {
		// TODO Auto-generated method stub
		this.coteA = this.coteA / facteur;
		this.coteB = this.coteB / facteur;
		this.coteC = this.coteC / facteur;
	}

}
