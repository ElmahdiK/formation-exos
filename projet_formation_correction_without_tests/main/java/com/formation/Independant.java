package com.formation;

import java.util.ArrayList;
import java.util.List;

public class Independant implements IWorker {

    private String nom;
    private String numeroSIREN;
    private List<Facture> factures = new ArrayList<>();

    public Independant(String nom, String numeroSIREN) {
        this.nom = nom;
        this.numeroSIREN = numeroSIREN;
    }

    public void addFacture(Facture facture) {
        this.factures.add(facture);
    }

    public double calculerSalaire() {
        double total = 0;
        for (Facture facture : factures) {
            if (!facture.estFraisDeDeplacement()) {
                total += facture.getMontant();
            }
        }
        return total;
    }

    public String getNom() {
        return "Indépendant " + nom;
    }
}
