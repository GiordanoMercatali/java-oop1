package org.lessons.java.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Account newAccount = new Account(123, "Giordano Mercatali", 0);
        
        System.out.println("Add money: ");
        double moneyToAdd = Double.parseDouble(myScanner.nextLine());
        System.out.println("Current balance: " + newAccount.addMoney(moneyToAdd));

        System.out.println("Take money: ");
        double moneyToTake = Double.parseDouble(myScanner.nextLine());
        System.out.println("Current balance: " + newAccount.takeMoney(moneyToTake));
    }
}
