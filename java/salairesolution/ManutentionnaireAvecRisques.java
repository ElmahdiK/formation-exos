package salairesolution;

//Classe Manutentionnaire avec risque, héritant de Manutentionnaire et implémentant EmployeARisque
class ManutentionnaireAvecRisque extends Manutentionnaire implements EmployeARisque {
 public ManutentionnaireAvecRisque(String nom, String prenom, int age, String dateEntree, int heuresTravaillees) {
     super(nom, prenom, age, dateEntree, heuresTravaillees);
 }

 @Override
 public double calculerSalaire() {
     return super.calculerSalaire() + PRIME_RISQUE;
 }
}