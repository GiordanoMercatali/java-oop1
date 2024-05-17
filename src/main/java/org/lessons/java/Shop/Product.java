package org.lessons.java.Shop;

import java.util.Scanner;

public class Product {    

    // Scanner myScanner = new Scanner(System.in);
    int code;
    String name;
    String description;
    double price;
    double vat; //IVA, based on Italian VAT (22%)

    Product(){
        vat = 22;
    }

    public Product(int code, String name, String description, double price, double vat){
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vatPerc(vat);
    }

    double vatPerc(double iva){
        return (iva / 100);
    }

    double getTaxedPrice(double priceToTax){
        // double price = Double.parseDouble(myScanner.nextLine());
        return priceToTax + (priceToTax * vat);
    }

    // int getCode(){
    //     int newCode = code;
    //     // int newCode = (int)Math.random();
    //     return newCode;
    // }

    String getCode(){
        String newCode = "0000" + String.valueOf(code);
        return newCode;
    }

    String getCodeName(){
        String newCodeName = "0000" + String.valueOf(code) + "-" + name;
        return newCodeName;
    }
}