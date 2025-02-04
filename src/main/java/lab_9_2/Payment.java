package lab_9_2;

import java.util.Scanner;

public abstract class Payment {
    double amount;
    String currency;


    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }


    public abstract void processPayment();
    public abstract boolean validatePayment();


    public void displayDetails() {
        System.out.println("Payment Details:");
        System.out.println("Amount: " + amount + " " + currency);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter payment type (CreditCard, BankTransfer, or 'exit' to quit): ");
            String paymentType = scanner.nextLine();

            if (paymentType.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter the payment amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter the currency: ");
            String currency = scanner.nextLine();

            Payment payment = null;

            switch (paymentType.toLowerCase()) {
                case "creditcard":
                    System.out.println("Enter your 16-digit credit card number: ");
                    String cardNumber = scanner.nextLine();

                    payment = new CreditCardPayment(amount, currency, cardNumber);

                    if (payment.validatePayment()) {
                        payment.displayDetails();
                        payment.processPayment();
                    } else {
                        System.out.println("Invalid Credit Card Number. Please try again.");
                    }
                    break;

                case "banktransfer":
                    System.out.println("Enter your 10-digit bank account number: ");
                    String bankAccountNumber = scanner.nextLine();

                    payment = new BankTransferPayment(amount, currency, bankAccountNumber);

                    if (payment.validatePayment()) {
                        payment.displayDetails();
                        payment.processPayment();
                    } else {
                        System.out.println("Invalid Bank Account Number. Please try again.");
                    }
                    break;

                default:
                    System.out.println("Invalid payment type. Please try again.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
        System.out.println("Program terminated.");
    }
}


