package com.example.interfaceprograms;

public class MyInterfaceProg {
    public static void main(String[] args) {
        Bankaccount[] accounts = new Bankaccount[2];
        accounts[0] = new Bankaccount(0);
        accounts[1] = new Bankaccount(10000);
        System.out.println("Average balance : " + average(accounts));

        Country[] countries = new Country[2];
        countries[0] = new Country();
        countries[0].setCountry("Uruguay");
        countries[0].setArea(176220);
        countries[1] = new Country("Thailend", 514000);
        System.out.println("Average area: " + average(countries));
    }

    private static double average(Country[] objects) {
        if (objects.length == 0) {return 0;}
        double sum = 0;
        for ( Country obj : objects) {
            sum = sum +obj.getArea() ;
        }
        return  sum / objects.length;
    }

    private static double average(Bankaccount[] objects){
        if (objects.length == 0) {return 0;}
        double sum = 0;
        for ( Bankaccount obj : objects) {
            sum = sum +obj.getBalance() ;
        }
        return  sum / objects.length;

        }
    }