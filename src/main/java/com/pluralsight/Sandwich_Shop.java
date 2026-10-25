package com.pluralsight;

import java.util.*;

public class Sandwich_Shop {

    static List<Double> prices=new ArrayList<>();
    static double discount=1.0;
    static double totalPrice=0.0;
    static Scanner scanner=new Scanner(System.in);

    static int ansint=0;
    static int ansint2=0;
    static double ansdouble=0.0;
    public static void main(String[] args) {

        prices.add(5.45);
        prices.add(8.95);

        System.out.println(" list of sandwich sizes:");
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        System.out.print("enter item number here ->: ");
        ansint=scanner.nextInt();

        totalPrice=prices.get(ansint-1);

        System.out.println(" list of sandwich load sizes:");
        System.out.println("Regular: $1.00");
        System.out.println("Large: $1.75");
        System.out.println("1 is yes while 0 is no");
        System.out.print("do you want to load your sandwich(1/0)->: ");

        ansint2=scanner.nextInt();

        System.out.print("what is your age? enter here ->: ");
        ansdouble=scanner.nextDouble();

        if (ansdouble<=17){
            discount=.1;
        } else if (ansdouble>=65){
            discount=.2;
        }

        double subPrice = totalPrice*discount;

        totalPrice=totalPrice-subPrice;

        if (ansint2==1){
            if (ansint==1){
                totalPrice=totalPrice+1;
            }else {
                totalPrice=totalPrice+1.75;
            }
        }

        System.out.print(String.format("the cost of the sandwich is $%.2f",totalPrice));

    }
}