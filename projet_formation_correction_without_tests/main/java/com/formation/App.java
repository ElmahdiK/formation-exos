package com.formation;

public class App {

    public static void main(final String[] args) {
        final Staff<Salesman> staffSalesman = new Staff<>();

        staffSalesman.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
        //staffSalesman.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));

        final Staff<IWorker> staff = new Staff<>();
        staff.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
        staff.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
        staff.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
        staff.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
        staff.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
        staff.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));

        Independant independant1 = new Independant("Jean", "123456789");
        independant1.addFacture(new Facture("Consultation technique", "01/2024", 1500));
        independant1.addFacture(new Facture("Frais de déplacement - Paris", "01/2024", 500));
        independant1.addFacture(new Facture("Installation logicielle", "01/2024", 800));

        staff.add(independant1);

        Salesman pierre = new Salesman("Pierre", "TROPRICHE", 45, "1995", 30000);

        AugmentationSalaireDecorator pierreAugmente = new AugmentationSalaireDecorator(pierre, 10);
        staff.add(pierre);
        staff.add(pierreAugmente);

        AugmentationSalaireDecorator pierreAugmenteAugmente = new AugmentationSalaireDecorator(pierreAugmente, 10);
        staff.add(pierreAugmenteAugmente);


        staff.displaySalaries();
        staff.displayAverageSalary();
    }
}
