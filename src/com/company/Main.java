package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Lamp lamp1 = new Lamp("lampe1");
        Lamp lamp2 = new Lamp("lampe2");
        Lamp lamp3 = new Lamp("lampe3");
        Lamp lamp4 = new Lamp("lampe4");
        Lamp lamp5 = new Lamp("lampe5");

        Lamp selectedLamp = null;

        while (true) {
            System.out.println("Lampe 1 er " + lamp1
                    + "\nLampe 2 er " + lamp2
                    + "\nLampe 3 er " + lamp3
                    + "\nLampe 4 er " + lamp4
                    + "\nLampe 5 er " + lamp5);

            int toggle = scanner.nextInt();

            if (toggle == 1) {
                selectedLamp = lamp1;

            } else if (toggle == 2) {
                selectedLamp = lamp2;

            } else if (toggle == 3) {
                selectedLamp = lamp3;

            } else if (toggle == 4) {
                selectedLamp = lamp4;

            } else if (toggle == 5) {
                selectedLamp = lamp5;

            }

            selectedLamp.lampSwitch();

        }
    }
}
