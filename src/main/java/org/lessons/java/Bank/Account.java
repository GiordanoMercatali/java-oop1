package org.lessons.java.Bank;

public class Account {
    int accountNumber;
    String ownerName;
    double balance;

    Account(){
        balance = 0;
    }

    Account(int accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
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
