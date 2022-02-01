package com.training.example.bank;

import java.lang.reflect.Array;

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

    public Compte[] getComptes() {
        return this.comptes;
    }

    public void virement(int compte1, int compte2, float valeur) {
        if (this.getComptes()[compte1] != null && this.getComptes()[compte2] != null) {
            this.getComptes()[compte1].retrait(valeur);
            this.getComptes()[compte2].depot(valeur);
            System.out.println("Virement ok");
        } else {
            System.out.println("Un des deux comptes est erronné");
        }
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
        if (this.nbComptes < comptes.length) {
            this.comptes[this.nbComptes] = new Compte(this.nbComptes);
            this.nbComptes++;
            System.out.println("Nouveau compte ajouté avec succès");
        } else {
            System.out.println("Impossible d'ajouter un nouveau compte, limite de 100 atteinte");
        }
    }

    public void renflouer() {
        if (this.getComptes()[0].getSolde() < 0) {
            float aRembourser = Math.abs(this.getComptes()[0].getSolde());
            if (this.getSolde() >= aRembourser) {
                for (int i = 1; i < this.nbComptes; i++) {
                    this.virement(i, 0, this.getComptes()[i].getSolde());
                }
                System.out.println("Compte courant renfloué");
                this.afficherSolde();
            } else {
                System.out.println("Renflouement impossible");
            }
        } else {
            System.out.println("Le solde du compte courant positif");
        }
    }

    public static void main(String[] args) {

    }
}
