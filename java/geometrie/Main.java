package geometrie;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c = new Cercle(5);
		Rectangle r = new Rectangle(5, 2);
		Triangle t = new Triangle(4, 2, 3);
		TriangleEquilateral te = new TriangleEquilateral(6);

		List<Forme> formes = List.of(c, r, t, te);
		formes.forEach(forme -> {
			System.out.println("FORME : " + forme.getClass().getSimpleName());
			System.out.printf("AIRE : %.2f \n", forme.calculerAire());
			System.out.printf("PERIMETRE : %.2f \n", forme.calculerPerimetre());
			System.out.println("\n");
		});

		Forme[] tabFormes = { c, r, t, te };
		CalculateurGeometrique cg = new CalculateurGeometrique();
		System.out.printf("\nAire totale avant transformation : %.2f \n", cg.aireTotale(tabFormes));
		System.out.printf("Périmètre total avant transformation : %.2f \n", cg.perimetreTotal(tabFormes));

		c.agrandir(2);
		System.out.println("\nAprès transformation :\n");

		System.out.println("FORME : " + c.getClass().getSimpleName());
		System.out.printf("AIRE : %.2f \n", c.calculerAire());
		System.out.printf("PERIMETRE : %.2f \n", c.calculerPerimetre());

		System.out.printf("\nAire totale après transformation : %.2f \n", cg.aireTotale(tabFormes));
		System.out.printf("Périmètre total après transformation : %.2f \n", cg.perimetreTotal(tabFormes));
	}

}
