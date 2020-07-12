package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pokracovat = "ano";

        while (pokracovat.equals("ano")) {
            System.out.println("napíšte číslo:");
            String y = sc.nextLine();
            Double x = Double.parseDouble(y);
            Double q = Math.sqrt(x);

            int z = 0;
            int delitel = 0;
            // prvá časť - zistenie prvočísla
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
                System.out.println("číslo nie je prvočíslo a počet delitelov je " + (delitel)); //upraviť
            }

// druhá časť - Goldbachova hypotéza - even number = sum of two odd numbers


            if (z != 1) {
                System.out.println("zadajte 1, ak chcete nájsť dve prvé prvočíselné súčty čísla , alebo 2, chcete vypísať všetky dvojice prvočíselných súčtov");
                String vstup = sc.nextLine();
                int x1 = Integer.parseInt(vstup);
                if (x1 == 1) {
                    for (int i = 1; i < x; i++) {
                        int z1 = 0;
                        int z2 = 0;

                        for (int j = 1; j < (x-i) ; j++) {

                            if ((x - i) % j == 0) {
                                z1++;
                            }
                        }

                        for (int j = 1; j < i ; j++) {
                            if ((i % j) == 0) {
                                z2++;
                            }
                        }

                        if ((z2 == 1) && (z1 == 1)) {
                            System.out.println("Prvočísla, ktorých súčet je rovný danému číslu: " + i + " a " + (int) ((x - i)));
                            break;
                        }
                    }
                }
            }
            System.out.println("Chcete zadať ďalšie číslo? (ano/nie)");
                    pokracovat = sc.nextLine();





        }
        System.out.println("Ďakujem za použitie programu prvočísla.");
    }
}

        //primes


