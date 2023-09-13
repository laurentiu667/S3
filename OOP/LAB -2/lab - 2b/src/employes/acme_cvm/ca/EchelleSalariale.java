package employes.acme_cvm.ca;

public class EchelleSalariale {

    private double Niv1Min = 20000.00;
    private double Niv1Max = 49999.99;
    private double Niv2Min = 50000.00;
    private double Niv2Max = 74999.99;

    public double salaireMaxParNiveau(int niveau){
        if (niveau >= 1){
            return this.Niv1Max;
        }
        else if (niveau >= 2) {
            return this.Niv2Max;
        }
        return 0;
    }

    public int trouveNiveau (double salaire){
        if (salaire <= Niv1Max){
            return 1;
        }
        else if (salaire <= Niv2Max){
            return 2;
        }
        return 0;
    }

    public double salaireMaxParSalaire(double salaire){
        if (trouveNiveau(salaire) == 1){
            return Niv1Max;
        }
        else if (trouveNiveau(salaire) == 2){
            return Niv2Max;
        }
        return 0;

    }



}
