package employes.acme_cvm.ca;

public class EchelleAugmentation {
    private double tauxAugNiv1;
    private double tauxAugNiv2;

    public void setNiveaux(double augNiv1, double augNiv2){
        this.tauxAugNiv1 = augNiv1;
        this.tauxAugNiv2 = augNiv2;
    }
    public double tauxAugmentationParNiveau(int niveau){
        switch (niveau) {
            case 1:
                return this.tauxAugNiv1;
            case 2:
                return this.tauxAugNiv2;
            default:
                return 0;
        }
    }

    public double tauxAugmentationParSalaire(double salaire){
        EchelleSalariale echelleSalariale = new EchelleSalariale();
        return tauxAugmentationParNiveau(echelleSalariale.trouveNiveau(salaire));
    }
}
