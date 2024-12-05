package salairesolution;

//Classe Producteur avec risque, héritant de Producteur et implémentant EmployeARisque
class ProducteurAvecRisque extends Producteur implements EmployeARisque {
 public ProducteurAvecRisque(String nom, String prenom, int age, String dateEntree, int unitsProduced) {
     super(nom, prenom, age, dateEntree, unitsProduced);
 }

 @Override
 public double calculerSalaire() {
     return super.calculerSalaire() + PRIME_RISQUE;
 }
}