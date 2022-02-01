package com.training.example.bank;

import java.util.Scanner;

public class BanqueInteractive {
    public static void interactionAjoutClient(Banque banque, Scanner scan) {
        System.out.println("Entrez le nom du client");
        String entry = scan.next();
        banque.ajouterClient(entry);
        System.out.println("Le client a bien été ajouté");
        interaction(banque, scan);
    }

    public static void selectClient(Banque banque, Scanner scan) {
        System.out.println("Quel client ?");
        Client client = banque.trouverClient(scan.next());
        interactionOperationClient(banque, scan, client);
    }

    public static void interactionOperationClient(Banque banque, Scanner scan, Client client) {
        System.out.println("Que voulez-vous faire ?");
        System.out.println("1) Afficher un bilan");
        System.out.println("2) Ajouter un compte");
        System.out.println("3) Faire un retrait");
        System.out.println("4) Faire un dépôt");
        System.out.println("5) Faire un virement");
        System.out.println("6) Renflouer le compte courant");
        System.out.println("7) Changer de client");
        System.out.println("8) Menu principal");
        int entry = scan.nextInt();

        if (entry == 1) {
            client.afficherSolde();
            interactionOperationClient(banque, scan, client);
        } else if (entry == 2) {
            client.ajouterCompte();
            interactionOperationClient(banque, scan, client);
        } else if (entry == 3) {
            System.out.println("Retirer combien ?");
            client.getComptes()[0].retrait(scan.nextFloat());
            interactionOperationClient(banque, scan, client);
        } else if (entry == 4) {
            System.out.println("Déposer combien ?");
            client.getComptes()[0].depot(scan.nextFloat());
            interactionOperationClient(banque, scan, client);
        } else if (entry == 5) {
            System.out.println("Quel compte de retrait ?");
            int compte1 = scan.nextInt();
            System.out.println("Quel compte de dépôt ?");
            int compte2 = scan.nextInt();
            System.out.println("Quelle somme ?");
            float valeur = scan.nextFloat();
            client.virement(compte1, compte2, valeur);
            interactionOperationClient(banque, scan, client);
        } else if (entry == 6) {
            client.renflouer();
            interactionOperationClient(banque, scan, client);
        } else if (entry == 7) {
            selectClient(banque, scan);
        } else {
            interaction(banque, scan);
        }
    }

    public static void interaction(Banque banque, Scanner scan) {
        System.out.println("Quelle opération voulez-vous effectuer ?");
        System.out.println("1) Ajouter un client");
        System.out.println("2) Effectuer une opération sur un client");
        System.out.println("3) Afficher un bilan général");
        System.out.println("4) Renflouement général");
        System.out.println("0) Quitter");
        int entry = scan.nextInt();

        if (entry == 1) {
            interactionAjoutClient(banque, scan);
        } else if (entry == 2) {
            selectClient(banque, scan);
        } else if (entry == 3) {
            banque.afficherBilan();
            interaction(banque, scan);
        } else if (entry == 4) {
            banque.renflouer();
            interaction(banque, scan);
        } else if (entry != 0) {
            interaction(banque, scan);
        }
    }

    public static void main(String[] args) {

    }
}
