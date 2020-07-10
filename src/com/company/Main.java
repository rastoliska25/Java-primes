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
    System.out.println("číslo je prvočíslo");
}
else
    System.out.println("číslo nie je prvočíslo a počet delitelov je "+ (z+1));

// druhá časť - Goldbachova hypotéza - even number = sum of two odd numbers



    }
}
