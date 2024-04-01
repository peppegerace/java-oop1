package org.experis.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci Nome e Cognome: ");
        String nameAccount = scan.nextLine();


        BankAccount accountOne = new BankAccount(nameAccount);
        System.out.println("Benvenuto " + accountOne.name);
        System.out.println("Numero conto: " + accountOne.numberAccount);
        System.out.println("Saldo disponibile: " + accountOne.balance);

        boolean toBeContinued = true;
        while (toBeContinued) {
            System.out.println("Cosa desideri fare?");
            System.out.println("1. Versare una somma di denaro");
            System.out.println("2. Prelevare una somma di denaro");
            System.out.println("3. Uscire");
            System.out.print("Inserire un numero valido: ");
            int choise = scan.nextInt();

            switch (choise) {
                case 1:
                    System.out.print("quanto vuoi versare? ");
                    double paymentAccount = scan.nextDouble();
                    if (accountOne.paymentOperation(paymentAccount)) {
                        System.out.println("Versamento di " + paymentAccount + "€ effettuato. Saldo attuale: " + accountOne.balance + "€");
                    }

                    break;
                case 2:
                    System.out.print("quanto vuoi prelevare? ");
                    double bankWithdrawal = scan.nextDouble();
                    if (accountOne.depositOperation(bankWithdrawal)) {
                        System.out.println("Prelievo di " + bankWithdrawal + "€ effettuato. Saldo attuale: " + accountOne.balance);
                    } else {
                        System.out.println("Saldo insufficiente per proseguire con l'azione richiesta.");
                    }
                    break;
                case 3:
                    toBeContinued = false;
                    System.out.println("Grazie di averci preferito. Arrivederci " + accountOne.name);
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }

        scan.close();
    }
}
