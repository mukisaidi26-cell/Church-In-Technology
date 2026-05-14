package org.example;

public class MobileMoney {
    String senderName;
    String receiverName;
    double balance;
    String phoneNumber;
    int pin;

    public void sendMoney(String senderName, String receiverName, double amount) {
        if (amount < balance) {
            System.out.println("You have insufficient funds to complete this transaction. Borrow by dailing *185#");
        } else if (amount > balance) {
            balance = balance - amount;
            System.out.println("You have successfully sent UGX " + amount + " to " + receiverName + ". Your new balance is UGX" + balance);
        }
    }

    void receiveMoney(String senderName, String receiverName, double amount) {
        balance = balance + amount;
        System.out.println("You have received UGX " + amount + "from " + senderName + ". Your new account balance is " + balance);
    }


    /*public static void main (String[] args) {
        MobileMoney account = new MobileMoney();

        account.senderName = "Alvin David";
        account.receiverName = "Tagoole David";
        account.balance = 80000;
        account.phoneNumber = "0758862363";
        account.pin = 5555;

        account.sendMoney("Alvin David", "Drena Jenifer", 20000);
        account.receiveMoney("Drena Jennifer", "Alvin David", 1100);
    } */
}

