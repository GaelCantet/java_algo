package com.training.example.bank;

public class Compte {
    private int numero;
    private float solde = 0;

    public Compte(int numero) {
        this.numero = numero;
    }

    public void depot(float valeur) {
        this.solde += valeur;
    }

    public void retrait(float valeur) {
        this.solde -= valeur;
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
