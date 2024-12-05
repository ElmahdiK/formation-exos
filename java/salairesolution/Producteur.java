package salairesolution;

//Classe Producteur héritant de Employe
public class Producteur extends Employe {
 private int unitsProduced;
 private static final double UNIT_RATE = 5;

 public Producteur(String nom, String prenom, int age, String dateEntree, int unitsProduced) {
     super(nom, prenom, age, dateEntree);
     this.unitsProduced = unitsProduced;
 }

 @Override
 public double calculerSalaire() {
     return unitsProduced * UNIT_RATE;
 }
}