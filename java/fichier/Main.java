package fichier;

import java.io.FileNotFoundException;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileNameIn = "src/fichier_entree.txt";
		String fileNameOut = "src/fichier_sortie.txt";
		String fileNameTest = "src/superrrr.txt";

		Fichier file = new Fichier(fileNameIn, fileNameOut);
		file.traitementFichier("rcice");
	}

}
