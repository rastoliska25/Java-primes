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
            int pocetdvojic=0;


            // prvá časť - zistenie prvočísla

            Jeprime zistenie = new Jeprime();
            zistenie.prime(x,q);

int z = zistenie.z;

// druhá časť


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

// uloženie dvojíc do pola



                if (x1 == 2) {
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
                            pocetdvojic++;
                        }
                    }

int [] pole = new int [pocetdvojic];

int umiestnenie =0;
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
                           pole[umiestnenie] = i;
                           umiestnenie++;
                        }
                    }
                    System.out.println("výpis prvočíselných dvojíc: ");
for (int i : pole){
    System.out.print(i + "+" + ((int)(x-i)) +"\n");
}

                }

/////















            }
            System.out.println("Chcete zadať ďalšie číslo? (ano/nie)");
                    pokracovat = sc.nextLine();





        }
        System.out.println("Ďakujem za použitie programu prvočísla.");
    }
}

        //primes


