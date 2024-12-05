package salairesolution;

//Classe Vendeur héritant de Employe
public class Vendeur extends Employe {
 private double chiffreAffaire;
 private static final double COMMISSION = 0.20;
 private static final double PRIME = 400;

 public Vendeur(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
     super(nom, prenom, age, dateEntree);
     this.chiffreAffaire = chiffreAffaire;
 }

 @Override
 public double calculerSalaire() {
     return chiffreAffaire * COMMISSION + PRIME;
 }
}