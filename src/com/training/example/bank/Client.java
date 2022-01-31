package com.training.example.bank;

public class Client {
    private String nom;
    private Compte[] comptes = new Compte[100];
    private int nbComptes = 0;

    public Client(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public float getSolde() {
        float solde = 0;
        for (int i = 0; i < this.nbComptes; i++) {
            solde += comptes[i].getSolde();
        }
        return solde;
    }

    public void afficherSolde() {
        for (int i = 0; i < this.nbComptes; i++) {
            comptes[i].afficherSolde();
        }
    }

    public void ajouterCompte() {
        if (nbComptes < comptes.length) {
            this.comptes[nbComptes] = new Compte();
            this.nbComptes++;
        } else {
            System.out.println("Impossible d'ajouter un nouveau compte, limite de 100 atteinte");
        }
    }

    public static void main(String[] args) {

    }
}
