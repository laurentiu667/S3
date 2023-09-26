package validation;

public class ValidationFormulaire {

    public boolean validerNom(String nom) {
        // Si le nom contient que des lettres et contient ainsi un tiret ("-")
        return nom.matches("^[a-zA-Z\\-]+$");
    }

    public boolean validerNumero(String num) {
        return num.matches("^[a-zA-Z0-9]+$");
    }

    public boolean validerSalaireHoraire(double salaire) {
        return salaire >= 15.25;
    }

    public boolean validerNbreHeuresSemaine(double nombre_dheure_semaine) {
        return nombre_dheure_semaine >= 1 && nombre_dheure_semaine <= 80;
    }

    public boolean validerAnciennete(int anciennete) {
        return anciennete >= 0;
    }

    public boolean validerEmploye(String nom, String numero, double salaireHoraire, double nbreHeuresSemaine, int anciennete) {
        return (validerNom(nom) && validerNumero(numero) && validerSalaireHoraire(salaireHoraire) && validerNbreHeuresSemaine(nbreHeuresSemaine) && validerAnciennete(anciennete));
    }

}
