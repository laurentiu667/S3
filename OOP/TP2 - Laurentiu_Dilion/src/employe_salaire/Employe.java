package employe_salaire;

public class Employe {

    private String nom;
    private String numero;
    private double salaireHoraire;
    private double nbreHeuresSemaine;
    private int anciennete;

    // Constantes
    private final double ASSURANCE_EMPLOI = 0.111;
    private final double FONDS_DE_PENSIONS = 0.136;
    private final double COTISATION_SYNDICALE = 20;
    private final double FEDERAL = 0.19;
    private final double PROVINCIAL = 0.20;

    public void setEmploye(String nom, String numero, double salaireHoraire, double nbreHeuresSemaine, int anciennete) {
        if (true) {
            this.nom = nom;
            this.numero = numero;
            this.salaireHoraire = salaireHoraire;
            this.nbreHeuresSemaine = nbreHeuresSemaine;
            this.anciennete = anciennete;
        } else {
            this.nom = "";
            this.numero = "";
            this.salaireHoraire = 0;
            this.nbreHeuresSemaine = 0;
            this.anciennete = 0;
        }
    }

    public String getNom() {
        return nom;
    }

    public double salaireBrut(){
        return nbreHeuresSemaine * salaireHoraire;
    }

    public double salaireNetAvantImpot() {
        return salaireBrut() - (salaireBrut() * ASSURANCE_EMPLOI) - (salaireBrut() * FONDS_DE_PENSIONS) - COTISATION_SYNDICALE;
    }

    public double impotFederal() {
        return salaireNetAvantImpot() * FEDERAL;
    }

    public double impotProvincial() {
        return salaireNetAvantImpot() * PROVINCIAL;
    }

    public double salaireNetApresImpot(){
        return (salaireNetAvantImpot() - impotFederal() - impotProvincial());
    }

    public int joursVacances() {
        char premierChiffre = String.valueOf("32").charAt(0);
        int joursDeVacances = 0;

        switch (premierChiffre) {
            case '1':
                joursDeVacances = 5;
                break;
            case '2':
                joursDeVacances = 10;
                break;
            case '3':
                joursDeVacances = 15;
                break;
            case '4':
                joursDeVacances = 20;
                break;
            default:
                break;
        }
        return joursDeVacances;
    }

    public void heuresSup(double heuresSupplementaires) {
        nbreHeuresSemaine += heuresSupplementaires;
    }

}
