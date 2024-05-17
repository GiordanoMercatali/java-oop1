package org.lessons.java.Shop;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product(90, "Apple", "Lorem ipsum dolor sit amet", 1.20, 22);
        System.out.println("Original price: " + apple.price + "$");
        double taxedPrice = apple.getTaxedPrice(apple.price);
        System.out.println("Price with taxes: " + taxedPrice + "$");
        String code = apple.getCode();
        System.out.println("Product code: " + code);
        String codename = apple.getCodeName();
        System.out.println("Full product name+code: " + codename);
    }
}
