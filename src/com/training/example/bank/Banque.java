package com.training.example.bank;

import java.util.Arrays;

public class Banque {
    private String nom;
    private Client[] clients;

    public void ajouterClient(String nomDuClient) {
        Client[] nouveauClientArray = Arrays.copyOf(this.clients, this.clients.length + 1);
        nouveauClientArray[nouveauClientArray.length - 1] = new Client(nomDuClient);
        this.clients = nouveauClientArray;
    }

    public void bilanClient(String nomClient) {
        for (int i = 0; i < this.clients.length; i++) {
            if (clients[i].getNom() == nomClient) {
                clients[i].afficherSolde();
            }
        }
    }

    public void afficherBilan() {
        for (int i = 0; i < this.clients.length; i++) {
            this.clients[i].afficherSolde();
        }
    }

    public static void main(String[] args) {

    }
}
