package fichier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Fichier {
	private String fichierEntree;
	private String fichierSortie;

	public Fichier(String fichierEntree, String fichierSortie) {
		super();
		this.fichierEntree = fichierEntree;
		this.fichierSortie = fichierSortie;
	}

	public void traitementFichier() {
		this.traitementFichier("");
	}

	public void traitementFichier(String motCle) {
		// Lire le fichier avec try-with-resources : permet de gérer la fermeture des fichiers automatiquement ex: writer.close()
		try (BufferedReader br = new BufferedReader(new FileReader(fichierEntree));
				BufferedWriter writer = new BufferedWriter(new FileWriter(fichierSortie))) {
			int index = 1;
			String ligne;
			while ((ligne = br.readLine()) != null) {
				System.out.println(ligne);
				if (motCle != null) {
					if (ligne.toUpperCase().contains(motCle.toUpperCase())) writer.write((index++) + ". " + ligne + "\n");
				} else writer.write((index++) + ". " + ligne + "\n");
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Erreur : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
		}
	}
}
