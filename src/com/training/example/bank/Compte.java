package com.training.example.bank;

public class Compte {
    private int numero;
    private float solde;

    public void depot(float valeur) {

    }

    public void retrait(float valeur) {

    }

    public float getSolde() {
        return this.solde;
    }

    public void afficherSolde() {
        System.out.println("Compte n° " + this.numero + " : " + this.getSolde());
    }

    public void virer(float valeur, Compte destinataire) {

    }

    public static void main(String[] args) {

    }
}
