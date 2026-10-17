package com.pluralsight;

import java.util.*;

public class Sandwich_Shop {

    static List<Double> prices=new ArrayList<>();

    static double discount=0.0;

    static Scanner scanner=new Scanner(System.in);

    static int ansint=0;
    static double ansdouble=0.0;

    public static void main(String[] args) {

        prices.add(5.45);
        prices.add(8.95);

        System.out.println(" list of sandwich sizes:");
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        System.out.print("enter item number here ->:");
        ansint=scanner.nextInt();

        System.out.println("what is your age?: ");
        ansdouble=scanner.nextDouble();

        if (ansdouble<=17){
            discount=1;
        } else if (ansdouble>=65){
            discount=2;
        }

        double totalprice=prices.get(ansint-1)/discount;

        System.out.println("the cost of the sandwich is $"+totalprice);

    }
}