package salairesolution;

//Définition d'une classe abstraite Employe, représentant un employé de base dans l'entreprise.
public abstract class Employe {
 // Attributs de base pour tous les employés
 protected String nom;
 protected String prenom;
 protected int age;
 protected String dateEntree;

 // Constructeur de la classe Employe
 public Employe(String nom, String prenom, int age, String dateEntree) {
     this.nom = nom;
     this.prenom = prenom;
     this.age = age;
     this.dateEntree = dateEntree;
 }

 // Méthode abstraite pour calculer le salaire (doit être implémentée dans les sous-classes)
 public abstract double calculerSalaire();

 // Méthode pour obtenir le nom complet de l'employé
 public String getNom() {
     return "L'employé " + prenom + " " + nom;
 }
}