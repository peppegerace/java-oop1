package org.experis.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci Nome e Cognome: ");
        String nameAccount = scan.nextLine();


        BankAccount pippo = new BankAccount(nameAccount);
        System.out.println("Numero conto: " + pippo.numberAccount);



        scan.close();
    }
}
