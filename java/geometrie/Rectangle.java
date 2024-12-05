package geometrie;

public class Rectangle extends Forme implements Transformable {
	double longueur;
	double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerAire() {
		// TODO Auto-generated method stub

		// longueur*largeur
		return this.longueur * this.largeur;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub

		// 2*(longueur+largeur)
		return 2 * (this.longueur + this.largeur);
	}

	@Override
	public void agrandir(double facteur) {
		// TODO Auto-generated method stub
		this.longueur = this.longueur * facteur;
		this.largeur = this.largeur * facteur;
	}

	@Override
	public void reduire(double facteur) {
		// TODO Auto-generated method stub
		this.longueur = this.longueur / facteur;
		this.largeur = this.largeur / facteur;
	}

}
