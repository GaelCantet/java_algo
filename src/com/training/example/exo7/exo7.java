package com.training.example.exo7;

import java.lang.reflect.Array;
import java.util.Scanner;

public class exo7 {
    public static void countLetters(String entry) {
        System.out.println(entry.length());
    }

    public static void guessNumber(long number) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Devinez le nombre");
        int guess = scan.nextInt();
        if (guess > number) {
            System.out.println("Trop grand");
            guessNumber(number);
        } else if (guess < number) {
            System.out.println("Trop petit");
            guessNumber(number);
        } else {
            System.out.println("Bien joué");
            scan.close();
        }
    }

    public static void displayArray(String[] array) {
        String result = String.join(" - ", array);
        System.out.println("Valeurs du tableau : [" + result + "]");
    }

    public static void main(String[] args) {
        /*System.out.println("Saisissez un mot");
        Scanner scan = new Scanner(System.in);
        String mot = scan.next();
        countLetters(mot);*/

        /*long guess = Math.round(Math.random()*5);
        guessNumber(guess);*/

        String[] testArray = {"a","b","c","d","e"};
        displayArray(testArray);
    }
}
