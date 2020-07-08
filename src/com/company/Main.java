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
for (int i=2; i<q+1;i++){
    if (x%i==0){
        z++;
        System.out.print(i);
    }

}
System.out.println("počet delitelov je "+ z);

    }
}
