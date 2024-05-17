package org.lessons.java.Bank;

import java.util.Random;

public class Account {
    int accountNumber;
    String ownerName;
    double balance;

    Account(){
        balance = 0;
    }

    Account(String ownerName, double balance){
        this.accountNumber = new Random().nextInt(1000);;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    double addMoney(double moneyToAdd){
        balance += moneyToAdd;
        return balance;
    }

    double takeMoney(double moneyToTake){
        if (moneyToTake <= balance) {
            balance -= moneyToTake;
        } else {
            System.out.println("Not enough money on this account!");
        }
        return balance;
    }
}
