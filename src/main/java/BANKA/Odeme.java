package BANKA;

import java.util.Scanner;

public abstract class Odeme {
    private double Amount;
    private String currency;

    public Odeme(double amount, String currency) {
        Amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {


        Amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {

        this.currency = currency;
    }

    abstract  void processPayment();
    abstract boolean validatePayment(int odeme);
    void displayDetails(){
        System.out.println("odeme tutarı: "+Amount);
        System.out.println("Para Birimi:  "+currency);
    }

}

