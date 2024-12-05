package geometrie;

public class Cercle extends Forme implements Transformable {
	double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerAire() {
		// TODO Auto-generated method stub

		// PI*rayon^2
		return Math.PI * Math.pow(this.rayon, 2);
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub

		// 2*PI*rayon
		return 2 * Math.PI * (this.rayon);
	}

	@Override
	public void agrandir(double facteur) {
		// TODO Auto-generated method stub
		this.rayon = this.rayon * facteur;
	}

	@Override
	public void reduire(double facteur) {
		// TODO Auto-generated method stub
		this.rayon = this.rayon / facteur;
	}

}
