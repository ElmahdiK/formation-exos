package com.formation;

public abstract class Employe implements IWorker {

    private String prenom;
    private String nom;
    private int age;
    private String dateEntree;

    public Employe(String prenom, String nom, int age, String dateEntree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntree = dateEntree;
    }

    @Override
    public String toString() {
        return "L'employé "
                + prenom
                + " "
                + nom
                + " a un salaire de "
                + calculerSalaire()
                + " €";
    }

    public String getNom() {
        return "Employe " + nom + " " + prenom;
    }

}
