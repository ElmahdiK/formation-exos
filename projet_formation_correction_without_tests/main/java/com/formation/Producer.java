package com.formation;

public class Producer extends Employe {
    private int nbUnites;

    public Producer(String prenom, String nom, int age, String dateEntree, int nbUnites) {
        super(prenom, nom, age, dateEntree);
        this.nbUnites = nbUnites;
    }


    @Override
    public double calculerSalaire() {
        return this.nbUnites * 5;
    }
}