package geometrie;

public class TriangleEquilateral extends Triangle {
	double cote;

	public TriangleEquilateral(double cote) {
		super(cote, cote, cote);
		this.cote = cote;
	}

	@Override
	public double calculerAire() {
		return Math.pow(this.cote, 2) * Math.sqrt(3) / 4;
	}

	@Override
	public double calculerPerimetre() {
		return this.cote * 3;
	}
}
