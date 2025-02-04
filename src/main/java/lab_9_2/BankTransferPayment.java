package lab_9_2;


class BankTransferPayment extends Payment {
        String bankAccountNumber;

        public BankTransferPayment(double amount, String currency, String bankAccountNumber) {
            super(amount, currency);
            this.bankAccountNumber = bankAccountNumber;
        }

        @Override
        public boolean validatePayment() {

            return bankAccountNumber.matches("\\d{10}");
        }

        @Override
        public void processPayment() {
            System.out.println("Processing payment through Bank Transfer...");
            System.out.println("Bank Transfer Payment Successful!");
        }
    }

