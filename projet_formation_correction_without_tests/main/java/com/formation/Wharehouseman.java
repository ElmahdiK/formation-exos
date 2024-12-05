package com.formation;

public class Wharehouseman extends Employe {
    private int nbHeures;

    public Wharehouseman(String prenom, String nom, int age, String dateEntree, int nbHeures) {
        super(prenom, nom, age, dateEntree);
        this.nbHeures = nbHeures;
    }


    @Override
    public double calculerSalaire() {
        return this.nbHeures * 65;
    }
}