package com.formation;

public class Representant extends Employe {
    private int ca;

    public Representant(String prenom, String nom, int age, String dateEntree, int ca) {
        super(prenom, nom, age, dateEntree);
        this.ca = ca;
    }


    @Override
    public double calculerSalaire() {
        return this.ca * 0.2 + 800;
    }
}