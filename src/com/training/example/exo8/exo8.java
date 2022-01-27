package com.training.example.exo8;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exo8 {
    private static void ttc(double price, double tva) {
        double result = price * (1 + tva / 100);
        System.out.println(result);
    }

    private static void displayArray(double note, double[] notes) {
        ArrayList<Double> selection = new ArrayList<Double>();
        for (double i : notes) {
            if (i > note) {
                selection.add(i);
            }
        }
        System.out.println(selection);
    }

    private static void sortArray(double[] array, String order) {
        Arrays.sort(array);
        if (order.equals("asc")) {
            System.out.println(Arrays.toString(array));
        } else if (order.equals("desc")) {
            Collections.reverse(Arrays.asList(array));
            System.out.println(Arrays.toString(array));
        }
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    private static void pascal(int nb) {
        System.out.println(1);
        for (int i = 2; i <= nb; i++) {
            System.out.print(1 + " ");
            for (int j = 1; j <= i; j++) {
                int result = factorial(i)/(factorial(i-j)*factorial(j));
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }

    private static void checkMail(String mail) {
        boolean isMailOk = Pattern.matches("^\\D(\\S{2,})@(\\S{3,})\\.(\\S{2,})$", mail);
        if (isMailOk) {
            System.out.println("Mail ok");
        } else {
            System.out.println("Mail not ok");
        }
    }

    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Saisissez une longueur");
        int longueur = scan.nextInt();
        double[] notes = new double[longueur];
        for (int i = 0; i < longueur; i++) {
            System.out.println("Saisissez une note");
            notes[i] = scan.nextDouble();
        }
        System.out.println(Arrays.toString(notes));
        displayArray(10, notes);*/

        /*double[] testArray = {10,568,954,3214,152,3};
        sortArray(testArray, "desc");*/

        /*int nb = 10;
        pascal(nb);*/

        /*System.out.println("Un email?");
        Scanner scan = new Scanner(System.in);
        checkMail(scan.next());*/
    }
}
