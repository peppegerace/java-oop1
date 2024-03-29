package org.experis.shop;

import java.util.Random;

public class Product {

    // ATTRIBUTI
    public int code;
    public String nameProduct;
    public String description;
    public double price;
    public double iva;
    public String basePrice;
    public String extendedName;

    // COSTRUTTORI
    public Product(String nameProduct, String description, double price) {
        this.code = generateRandomNumber();
        this.nameProduct = nameProduct;
        this.description = description;
        this.price = price;
        this.iva = getProductIva();
        this.basePrice = getBasePrice();
        this.extendedName = getExtendedName();
    }


    // METODI
    public int generateRandomNumber() {
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(99999999);
        String formattedNumber = String.format("%08d", number);
        return Integer.parseInt(formattedNumber);
    }

    public double getProductIva() {
        return price /100 * 22;

    }
    public String getBasePrice() {
        return String.format("%.2f", price - getProductIva());
    }

    public String getExtendedName() {
        nameProduct = nameProduct.replaceAll(" ", "");
        return code+nameProduct;
    }

}
