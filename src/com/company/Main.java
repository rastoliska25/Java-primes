package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pokracovat;

        do {
            System.out.println("napíšte číslo:");
            String cislo = sc.nextLine();
            Double cisloparsed = Double.parseDouble(cislo);
            double x;
            x = cisloparsed > 0 ? cisloparsed :-cisloparsed;
            System.out.println(x);
            Double q = Math.sqrt(x);


            // prvá časť - zistenie

            Jeprime zistenie = new Jeprime();
            zistenie.prime(x,q);


// druhá časť - výpis
Vypis vypis = new Vypis();
vypis.vypisanie(zistenie.z, x);


            System.out.println("Chcete zadať ďalšie číslo? (ano/nie)");
                    pokracovat = sc.nextLine();


        } while (pokracovat.equals("ano"));
        System.out.println("Ďakujem za použitie programu prvočísla.");
    }
}

        //primes


