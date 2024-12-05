package salairesolution;

//Classe Manutentionnaire héritant de Employe
public class Manutentionnaire extends Employe {
 private int heuresTravaillees;
 private static final double HOUR_RATE = 65;

 public Manutentionnaire(String nom, String prenom, int age, String dateEntree, int heuresTravaillees) {
     super(nom, prenom, age, dateEntree);
     this.heuresTravaillees = heuresTravaillees;
 }

 @Override
 public double calculerSalaire() {
     return heuresTravaillees * HOUR_RATE;
 }
}