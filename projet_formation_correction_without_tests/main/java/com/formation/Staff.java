package com.formation;

import java.util.ArrayList;
import java.util.List;

public class Staff<T extends IWorker> {

    List<T> workers = new ArrayList<>();

    public void add(T w) {
        workers.add(w);
    }

    public void displaySalaries() {
        System.out.println("Liste des salaires :");
        for (T w : workers) {
            System.out.println(getSalaryDisplay(w));
        }
        System.out.println();
    }

    public String getSalaryDisplay(T w) {
        return "\t" + w.getNom() + " : " + w.calculerSalaire() + " €";
    }

    public void displayAverageSalary() {
        System.out.println("Valeur du salaire moyen : " + getAverageSalary() + " €");
    }

    public double getAverageSalary() {
        double somme = 0;
        if(workers.isEmpty()) {
            return somme;
        }
        for (T w : workers) {
            somme += w.calculerSalaire();
        }
        return somme / workers.size();
    }
}
