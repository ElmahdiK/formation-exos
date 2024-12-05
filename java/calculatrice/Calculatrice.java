package calculatrice;

public class Calculatrice {

	public Calculatrice() {
		// TODO Auto-generated constructor stub
	}

	int addition(int a, int b) {
		return a + b;
	}

	int soustraction(int a, int b) {
		return a - b;
	}

	int multiplication(int a, int b) {
		return a * b;
	}

	int division(int a, int b) throws ArithmeticException {
		if (b == 0)
			throw new ArithmeticException();
		return a / b;
	}

	void calculer(String a, String b, String operateur) {
		double resultat = 0;

		switch (operateur) {
		case "+":
			resultat = this.addition(Integer.parseInt(a), Integer.parseInt(b));
			break;
		case "-":
			resultat = this.soustraction(Integer.parseInt(a), Integer.parseInt(b));
			break;
		case "x":
			resultat = this.multiplication(Integer.parseInt(a), Integer.parseInt(b));
			break;
		case "/":
			resultat = this.division(Integer.parseInt(a), Integer.parseInt(b));
			break;
		default:
			// throw new NumberFormatException();
			return;
		}
		System.out.println("Résultat => " + resultat);
	}
}
