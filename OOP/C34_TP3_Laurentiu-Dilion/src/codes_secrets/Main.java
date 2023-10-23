package codes_secrets;

import codes_secrets.ChiffrementChaine;

public class Main {
    public static void main(String[] args) {

        ChiffrementChaine chiffrement = new ChiffrementChaine(3);
        chiffrement.setChaineAChiffrer("je n aime pas les chats");
        String chaineChiffree = chiffrement.chiffrer(chiffrement.getChaineAChiffrer(), chiffrement.getCleChiffrement());

        System.out.println("Chaine chiffrée : " + chaineChiffree);

        // Déchiffrement
        chiffrement.setChaineADechiffrer("mh#q#dlph#sdv#ohv#fkdwv");
        String chaineDechiffree = chiffrement.dechiffrer(chiffrement.getChaineADechiffrer(), chiffrement.getCleChiffrement());

        System.out.println("Chaine déchiffrée : " + chaineDechiffree);
    }
}
