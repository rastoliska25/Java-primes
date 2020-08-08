package com.company;

public class Jeprime {
int z = 0;
int delitel = 0;

    void prime(double x, double q) {

        for (int i = 1; i < q + 1; i++) {
            if (x % i == 0) {
                z++;
            }

        }

        if (z == 1) {
            System.out.println("Číslo je prvočíslo. Ak chcete pokračovať na rozklad čísel, zadajte párne číslo.");
        } else {
            for (int i = 1; i < x + 1; i++) {
                if (x % i == 0) {
                    delitel++;
                }
            }
            System.out.println("číslo nie je prvočíslo a počet delitelov je " + (delitel));
        }
    }
}
