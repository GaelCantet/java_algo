package com.training.example.bank;

import java.util.Arrays;

public class Banque {
    private String nom;
    private Client[] clients = new Client[0];

    public void ajouterClient(String nomDuClient) {
        Client[] nouveauClientArray = Arrays.copyOf(this.clients, this.clients.length + 1);
        nouveauClientArray[nouveauClientArray.length - 1] = new Client(nomDuClient);
        this.clients = nouveauClientArray;
    }

    public Client trouverClient(String nomClient) {
        Client client = new Client("truc");
        for (int i = 0; i < this.clients.length; i++) {
            if (clients[i].getNom() == nomClient) {
                client = clients[i];
            }
        }
        return client;
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
            System.out.println("Client n°" + i + ", " + this.clients[i].getNom());
            this.clients[i].afficherSolde();
        }
    }

    public void renflouer() {
        for (int i = 0; i < this.clients.length; i++) {
            this.clients[i].renflouer();
        }
    }

    public static void main(String[] args) {
        Banque banque = new Banque();
        banque.ajouterClient("truc");
        banque.ajouterClient("machin");
        banque.trouverClient("truc").ajouterCompte();
        banque.trouverClient("truc").ajouterCompte();
        banque.trouverClient("truc").getComptes()[0].depot(200.00f);
        banque.afficherBilan();
    }
}
