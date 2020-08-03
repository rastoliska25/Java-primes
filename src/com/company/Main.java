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


            // prvá časť - zistenie prvočísla

            Jeprime zistenie = new Jeprime();
            zistenie.prime(x,q);


// druhá časť
Vypis vypis = new Vypis();
vypis.vypisanie(zistenie.z, x);


            System.out.println("Chcete zadať ďalšie číslo? (ano/nie)");
                    pokracovat = sc.nextLine();


        }
        System.out.println("Ďakujem za použitie programu prvočísla.");
    }
}

        //primes


