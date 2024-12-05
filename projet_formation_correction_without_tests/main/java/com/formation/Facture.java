package com.formation;

public class Facture {
    private String libelle;
    private String date;
    private double montant;

    public Facture(String libelle, String date, double montant) {
        this.libelle = libelle;
        this.date = date;
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public boolean estFraisDeDeplacement() {
        return libelle.startsWith("Frais de déplacement - ");
    }
}
