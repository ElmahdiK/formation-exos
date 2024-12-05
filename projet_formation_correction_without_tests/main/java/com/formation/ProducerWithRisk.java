package com.formation;

public class ProducerWithRisk extends Producer {

    public ProducerWithRisk(String prenom, String nom, int age, String dateEntree, int nbUnites) {
        super(prenom, nom, age, dateEntree, nbUnites);
    }


    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + 200;
    }
}
