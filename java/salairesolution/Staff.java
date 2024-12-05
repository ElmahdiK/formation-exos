package salairesolution;

//Classe Staff pour gérer une collection d'employés
import java.util.ArrayList;

public class Staff {
 private ArrayList<Employe> employes = new ArrayList<>();

 // Ajouter un employé à la liste
 public void add(Employe e) {
     employes.add(e);
 }

 // Afficher le salaire de chaque employé
 public void displaySalaries() {
     System.out.println("Liste des salaires des employés :");
     for (Employe e : employes) {
         System.out.println(e.getNom() + " a un salaire de " + e.calculerSalaire() + " €");
     }
 }

 // Calculer et afficher le salaire moyen
 public void displayAverageSalary() {
     double total = 0;
     for (Employe e : employes) {
         total += e.calculerSalaire();
     }
     System.out.println("Valeur du salaire moyen : " + (total / employes.size()) + " €");
 }
}