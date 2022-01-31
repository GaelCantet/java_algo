package com.training.example.bank;

import java.util.Scanner;

public class BanqueInteractive {
    public static void interactionAjoutClient() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez le nom du client");
        String entry = scan.nextLine();

        System.out.println("Le client a bien été ajouté");
    }

    public static void interactionOperationClient() {
        Scanner scan = new Scanner(System.in);

    }

    public static void main(String[] args) {
        int entry = -1;
        while (entry != 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Quelle opération voulez-vous effectuer ?");
            System.out.println("1) Ajouter un client");
            System.out.println("2) Effectuer une opération sur un client");
            System.out.println("3) Afficher un bilan général");
            System.out.println("0) Quitter");

            entry = scan.nextInt();
            if (entry == 1) {
                interactionAjoutClient();
            } else if (entry == 2) {
                interactionOperationClient();
            } else {

            }
        }
    }
}
