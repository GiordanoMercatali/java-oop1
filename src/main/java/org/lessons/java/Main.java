package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Product p = new Product(90, "Apple", "Lorem ipsum dolor sit amet", 1.20, 0.22);
        System.out.println("Original price: " + p.price + "$");
        double taxedPrice = p.getTaxedPrice();
        System.out.println("Price with taxes: " + taxedPrice + "$");
        String code = p.getCode();
        System.out.println("Product code: " + code);
        String codename = p.getCodeName();
        System.out.println("Full product name+code: " + codename);
    }
}
