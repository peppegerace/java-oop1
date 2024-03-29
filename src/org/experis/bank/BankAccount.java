package org.experis.bank;

import java.util.Random;

public class BankAccount {
    // ATTRIBUTI
    public String numberAccount;
    public String name;
    public double balance;

    // COSTRUTTORE
    public BankAccount (String name) {
        this.name = name;
        this.numberAccount = generateRandomNumberAccount();
        this.balance = 0.0;
    }

    // METODI
    public String generateRandomNumberAccount() {
        Random random = new Random();
        int numberGenerate = random.nextInt(1000) +1;
        return String.format("%04d", numberGenerate);
    }
}
