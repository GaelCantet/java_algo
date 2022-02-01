package com.training.example.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banque banque = new Banque();
        Scanner scan = new Scanner(System.in);

        while (scan.nextInt() != 0) {
            BanqueInteractive.interaction(banque, scan);
        }
        scan.close();
    }
}
