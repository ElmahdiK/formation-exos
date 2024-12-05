package calculatrice;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatrice c = new Calculatrice();

		c.calculer("10", "5", "+");
		c.calculer("10", "5", "-");
		c.calculer("10", "5", "x");
		try {

			c.calculer("10", "0", "/");
		}
		catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Division par 0 impossible.");
		}
	}

}
