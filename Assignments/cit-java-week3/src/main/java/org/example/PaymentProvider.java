package org.example;
import java.util.ArrayList;

abstract class PaymentProvider {
    protected String accountHolderName;
    protected double balance;
    protected boolean isValidAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount!.");
            return false;
        }
        return true;
    }

    public PaymentProvider(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void pay(double amount);

    public abstract void checkBalance();

    public abstract void sendMoney(String recepient, double amount);

    public abstract void withdrawMoney(double amount);
}

class MTNMobileMoney extends PaymentProvider {
    private String phoneNumber;

    public MTNMobileMoney(String accountHolderName, String phoneNumber, double balance) {
        super(accountHolderName, balance);
        this.phoneNumber = phoneNumber;
    }

    public void pay(double amount) {
        if (isValidAmount(amount) && balance >= amount) {
            balance -= amount;
            System.out.println("MTN Payment of " + amount + " completed");
        } else {
            System.out.println("MTN Payment failed");
        }
    }

    public void checkBalance() {
        System.out.println("MTN Balance: " + balance);
    }

    public void sendMoney(String recipient, double amount) {
        if (isValidAmount(amount) && balance >= amount) {
            balance -= amount;
            System.out.println("MTN Sent " + amount + " to " + recipient);
        } else {
            System.out.println("MTN Transfer failed");
        }
    }

    public void withdrawMoney(double amount) {
        double charge = 500;
        double total = amount + charge;

        if (isValidAmount(amount) && balance >= total) {
            balance -= total;
            System.out.println("MTN Withdraw " + amount + " charge: " + charge);
        } else {
            System.out.println("MTN Withdraw failed");
        }
    }
 }

 abstract class AirtelMobileMoney extends PaymentProvider {
    private String phoneNumber;

    public AirtelMobileMoney(String accountHolderName, String phoneNumber, double balance) {
        super(accountHolderName, balance);
        this.phoneNumber = phoneNumber;
    }

    public void pay(double amount) {
        if (isValidAmount(amount) && balance >= amount) {
            balance -= amount;
            System.out.println("Airtel Payment of " + amount + " completed");
        } else {
            System.out.println("Airtel Payment  failed");
        }
    }

    public void checkBalance() {
        System.out.println("Airtel Balance: " + balance);
    }

    public void sendMoney(String recipient, double amount) {
        if (isValidAmount(amount) && balance >= amount) {
            balance -= amount;
            System.out.println("Airtel Sent " + amount + " to " + recipient);
        } else {
            System.out.println("Airtel Transfer failed");
        }
    }
 }

 class CardPayment extends PaymentProvider {
    private String cardNumber;

    public CardPayment(String accountHolderName, String cardNumber, double balance) {
        super(accountHolderName, balance);
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        if (isValidAmount(amount) && balance >= amount) {
            balance -= amount;
            System.out.println("Card Payment of " + amount + " completed ");
        } else {
            System.out.println("Card Payment failed");
        }
    }

    public void checkBalance() {
        System.out.println("Card Balance: " + balance);
    }

    public void sendMoney(String recipient, double amount) {
        if (isValidAmount(amount) && balance >= amount) {
            balance -= amount;
            System.out.println("Card Sent amount " + amount + " to " + recipient);
        } else {
            System.out.println("Crad Transfer failed");
        }
    }

    public void withdrawMoney(double amount) {
        double charge = 500;
        double total = amount + charge;

        if (isValidAmount(amount) && balance >= total) {
            balance -= total;
            System.out.println("Card Withdrawn " + amount + " charge " + charge );
        } else {
            System.out.println("Card withdrawal failed");
        }
    }
}

class Mainly {
    public static void main(String[] args) {
        ArrayList<PaymentProvider> providers = new ArrayList<>();

        providers.add(new MTNMobileMoney("Alvin", "0758862363", 50000));
        providers.add(new AirtelMobileMoney("Drena", "0702177975", 40000) {
            @Override
            public void withdrawMoney(double amount) {

            }
        });
        providers.add(new CardPayment("John", "32938923932", 4030000));

        for (PaymentProvider provider : providers) {
            provider.checkBalance();
            provider.pay(5000);
            provider.sendMoney("Richard", 7000);
            provider.withdrawMoney(5000);
            provider.checkBalance();
            System.out.println();
        }
    }
}