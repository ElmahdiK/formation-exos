package com.formation;

public class AugmentationSalaireDecorator implements IWorker {
    private IWorker employe;
    private double pourcentageAugmentation;

    public AugmentationSalaireDecorator(Employe employe, double pourcentageAugmentation) {
        this.employe = employe;
        this.pourcentageAugmentation = pourcentageAugmentation;
    }

    public AugmentationSalaireDecorator(AugmentationSalaireDecorator employe, double pourcentageAugmentation) {
        this.employe = employe;
        this.pourcentageAugmentation = pourcentageAugmentation;
    }

    @Override
    public double calculerSalaire() {
        double salaireOriginal = employe.calculerSalaire();
        return salaireOriginal + salaireOriginal * (pourcentageAugmentation / 100);
    }


    @Override
    public String getNom() {
        return employe.getNom() + " AUGMENTE";
    }
}
