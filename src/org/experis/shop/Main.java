package org.experis.shop;

public class Main {
    public static void main(String[] args) {
        Product productOne = new Product("Smartphone XYZ","performing smartphone", 400);

        System.out.println("Code: " + productOne.code);
        System.out.println("Product Name: " + productOne.nameProduct);
        System.out.println("Description: " +productOne.description);
        System.out.println("Final price: " + productOne.price + " €");
        System.out.println("VAT product: " + productOne.iva + " €");
        System.out.println("Base Price: " + productOne.basePrice + " €");
        System.out.println("Code Product: " + productOne.extendedName);


        Product productTwo = new Product("Smartphone ABC", "economic smartphone", 100);

        System.out.println("Code: " + productTwo.code);
        System.out.println("Product Name: " + productTwo.nameProduct);
        System.out.println("Description: " +productTwo.description);
        System.out.println("Final price: " + productTwo.price + " €");
        System.out.println("VAT product: " + productTwo.iva + " €");
        System.out.println("Base Price: " + productTwo.basePrice + " €");
        System.out.println("Code Product: " + productTwo.extendedName);

    }
}
