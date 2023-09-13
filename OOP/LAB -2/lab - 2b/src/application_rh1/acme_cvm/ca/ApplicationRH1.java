package application_rh1.acme_cvm.ca;

import employes.acme_cvm.ca.Employe;

import java.io.PrintWriter;

public class ApplicationRH1 {
    public static void main(String[] args) {
        int compteEmployes = 0;
        int compteExperience  = 0;
        int anneeCible = 2023   ;
        int ancienneteRetraite  = 35;

        Employe employe1 = new Employe();
        Employe employe2 = new Employe();

        employe1.setNomComplet("Albert Einstein");
        employe1.setSalaire(45_000);
        employe1.setAnneeEmbauche(2000);
        compteEmployes++;

        employe2.setNomComplet("Marie Curie");
        employe2.setSalaire(74_000);
        employe2.setAnneeEmbauche(2010);
        compteEmployes++;

        System.out.println("**********************");
        System.out.println("EMPLOYES ET ANCIENNETE");
        System.out.println("**********************");
        System.out.println("Salaire de " + employe1.getNomComplet() + "est de " + employe1.getSalaire());
        System.out.println("Salaire de " + employe2.getNomComplet() + "est de " + employe2.getSalaire());

        System.out.println(employe1.getNomComplet() + " a ete embaucher en " + employe1.getAnneeEmbauche());
        System.out.println(employe1.getNomComplet() + " aura " + employe1.ancienneteParAnneeCible(anneeCible) + " en " + anneeCible);
        System.out.println(employe2.getNomComplet() + "a ete embaucher en " + employe2.getAnneeEmbauche());
        System.out.println("Lorsque " + employe2.getNomComplet() + " aura " + ancienneteRetraite + " ans " + " d anciennete, nous seront en " + employe2.anneeCiblePourAnciennete(ancienneteRetraite));
        System.out.println("Le nombre total d'employés est de" + compteEmployes);


        System.out.println("Le nombre total d'années d'expérience des employés de l'entreprise est de " + (employe1.ancienneteParAnneeCible(anneeCible) + employe2.ancienneteParAnneeCible(anneeCible)));






    }
}
