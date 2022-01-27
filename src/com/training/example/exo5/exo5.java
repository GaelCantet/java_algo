package com.training.example.exo5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class exo5 {
    public static void main(String[] args) {
        /*int[] intArray = {10, 15, 20, 15, 14, 8};
        int result = 0;
        for (int i = 0; i < intArray.length; i++) {
            result = result + intArray[i];
        }
        System.out.println(result);*/

        /*System.out.println("Combien d'élèves ?");
        Scanner scan = new Scanner(System.in);
        int nbEleves = scan.nextInt();
        double[] gradesArray = new double[nbEleves];
        ArrayList<Double> gradesEight = new ArrayList<Double>();
        ArrayList<Double> gradesTen = new ArrayList<Double>();
        ArrayList<Double> gradesFifteen = new ArrayList<Double>();
        double total = 0;

        for (int i = 0; i < nbEleves; i++) {
            System.out.println("Note pour l'élève " + i);
            double note = scan.nextDouble();
            gradesArray[i] = note;
            total = total + note;
            if (note < 8) {
                gradesEight.add(note);
            }
            if (note > 10) {
                gradesTen.add(note);
            }
            if (note > 15) {
                gradesFifteen.add(note);
            }
        }
        scan.close();

        double moyenne = total / gradesArray.length;
        int nbMoyenne = 0;

        for (int j = 0; j < nbEleves; j++) {
            if (gradesArray[j] > moyenne) {
                nbMoyenne++;
            }
        }
        System.out.println("Moyenne: " + moyenne);
        System.out.println("Nombre d'élèves au dessus de la moyenne :" + nbMoyenne);
        System.out.println(Arrays.toString(gradesArray));
        System.out.println("Notes inférieures à 8" + gradesEight);
        System.out.println("Notes sup à 10" + gradesTen);
        System.out.println("Notes sup à 15" + gradesFifteen);*/

        /*int[] array1 = {4,8,7,9,1,5,4,6};
        int[] array2 = {7,6,5,2,1,3,7,4};
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));*/

        /*int[] array1 = {2,5,8,4};
        int[] array2 = {6,7};
        int total = 0;

        for (int i : array1) {
            for (int j : array2) {
                total = total + (i*j);
            }
        }
        System.out.println(total);*/

        /*System.out.println("Saisissez la longueur du tableau");
        Scanner scan = new Scanner(System.in);
        int longueur = scan.nextInt();
        int array1[] = new int[longueur];
        System.out.println("Saisissez les valeurs");
        for (int i = 0; i < longueur; i++) {
            int saisie = scan.nextInt();
            array1[i] = saisie;
        }
        scan.close();
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < longueur; i++) {
            array1[i] = array1[i] + 1;
        }
        System.out.println(Arrays.toString(array1));*/

        Scanner scan = new Scanner(System.in);
        int top = 0;
        int tries = 0;
        int count = 0;
        int entry = -1;

        while (entry != 0) {
            count++;
            entry = scan.nextInt();
            if (entry > top) {
                top = entry;
                tries = count;
            }
        }
        scan.close();
        System.out.println("Le plus grand nombre, en place " + tries + " est: " + top);

    }
}
