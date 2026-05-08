package org.example;

public class BankAccount {
        String accountNumber;
        String ownerName;
        double balance;
        boolean isActive;

        void deposit(double amount) {
            balance = balance + amount;
            System.out.println("Deposited UGX " + amount + ".New Balance is " + balance);
        }

        void withdraw(double amount) {
            balance = balance - amount;
            System.out.println("Withdrawn UGX " + amount + "New Balance is " + balance);
        }

        void printSummary() {
            System.out.println("Account: " + accountNumber + "Owner Name: " + ownerName);
            System.out.println("Balance: UGX " + balance + "Active: " + isActive);
        }

}