package com.company;

import java.util.Scanner;

public class Vypis {
    Scanner sc = new Scanner(System.in);
    void vypisanie (int z, double x){
        int pocetdvojic=0;
        boolean neexistuje=true;
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
                        neexistuje = false;
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
                        neexistuje = false;
                    }
                }
                System.out.println("výpis prvočíselných dvojíc: ");
                for (int i : pole){
                        System.out.print(i + "+" + ((int)(x-i)) +"\n");
                }


            }

        }
        if (neexistuje) System.out.println("Neexistuje ani jedna prvočíselná dvojica.");


    }


}
