package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("napíšte číslo:");
        String y = sc.nextLine();
        Double x = Double.parseDouble(y);
        Double q = Math.sqrt(x);
        int z=0;

        // prvá časť - zistenie prvočísla
for (int i=1; i<q+1;i++){
    if (x%i==0){
        z++;
    }

}

if (z==1){
    System.out.println("Číslo je prvočíslo. Ak chcete pokračovať na rozklad čísel, zadajte párne číslo.");
}
else
    System.out.println("číslo nie je prvočíslo a počet delitelov je "+ (z+1)); //upraviť

// druhá časť - Goldbachova hypotéza - even number = sum of two odd numbers

        if (z!=1){
            System.out.println("zadajte 1, ak chcete nájsť dva prvé prvočíselné súčty čísla , alebo 2, chcete vypísať všetky dvojice prvočíselných súčtov");
            String vstup = sc.nextLine();
            int x1 = Integer.parseInt(vstup);
            if (x1==1){
                for (int i=1; i<x;i++){
                   if ((i%2!=0) && ((x-i)%2!=0)){
                       System.out.println("Prvé dve prvočísla, ktorých súčet je rovný danému číslu: "+ i +" a "+(int)((x-i)));
                       break;
                    }
                }

            }
        }
//// next




    }
}
