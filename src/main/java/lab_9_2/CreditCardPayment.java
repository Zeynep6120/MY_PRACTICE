package lab_9_2;


class CreditCardPayment extends Payment {
    String cardNumber;

    public CreditCardPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean validatePayment() {

            return cardNumber.length() == 16;
        }


        @Override
        public void processPayment () {
            System.out.println("Processing payment through Credit Card...");
            System.out.println("Credit Card Payment Successful!");
        }
    }

