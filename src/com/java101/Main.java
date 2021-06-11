package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pearUnitPrice = 2.14, appleUnitPrice = 3.67, tomatoUnitPrice = 1.11, bananaUnitPrice = 0.95, aubergineUnitPrice = 5.0;
        double pearQuantity = 2.14, appleQuantity = 3.67, tomatoQuantity = 1.11, bananaQuantity = 0.95, aubergineQuantity = 5.0;

        System.out.print("Please type unit quantity of pear :");
        pearQuantity = input.nextDouble();

        System.out.print("Please type unit quantity of apple :");
        appleQuantity = input.nextDouble();

        System.out.print("Please type unit quantity of tomato :");
        tomatoQuantity = input.nextDouble();

        System.out.print("Please type unit quantity of banana :");
        bananaQuantity = input.nextDouble();

        System.out.print("Please type unit quantity of aubergine :");
        aubergineQuantity = input.nextDouble();

        double totalPrice = (pearUnitPrice * pearQuantity) + (appleUnitPrice * appleQuantity) + (tomatoUnitPrice * tomatoQuantity) + (bananaUnitPrice * bananaQuantity) + (aubergineUnitPrice * aubergineQuantity);

        System.out.print("Total price of products is " + totalPrice);
    }
}
