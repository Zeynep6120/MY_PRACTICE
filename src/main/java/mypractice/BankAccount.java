package mypractice;

public class BankAccount {




        private class Money {
            private long dollars;
            private int cents;

            public Money(String stringAmount) {
                abortOnNull(stringAmount);
                int length = stringAmount.length();
                dollars = Long.parseLong(stringAmount.substring(0, length - 3));
                cents = Integer.parseInt(stringAmount.substring(length - 2, length));
            }

            public String getAmount() {
                if (cents > 9) {
                    return (dollars + "." + cents);
                } else {
                    return (dollars + ".0" + cents);
                }
            }

            public void addIn(Money secondAmount) {
                abortOnNull(secondAmount);
                int newCents = (cents + secondAmount.cents) % 100;
                long carry = (cents + secondAmount.cents) / 100;
                cents = newCents;
                dollars = dollars + secondAmount.dollars + carry;
            }

            private void abortOnNull(Object o) {
                if (o == null) {
                    System.out.println("Unexpected null argument.");
                    System.exit(0);
                }
            }
        }

        private Money balance;

        public BankAccount() {
            balance = new Money("0.00");
        }

        public String getBalance() {
            return balance.getAmount();
        }

        public void makeDeposit(String depositAmount) {
            balance.addIn(new Money(depositAmount));
        }

        public void closeAccount() {
            balance = new Money("0.00");
        }

        public static void main(String[] args) {
            String stringAmount = "10023"; // 100.23
            BankAccount bankAccount = new BankAccount();
            Money money = bankAccount.new Money(stringAmount);

            System.out.println("Amount: " + money.getAmount());

            String stringAmount1 = "20045"; // 200.45
            Money money1 = bankAccount.new Money(stringAmount1);
            money.addIn(money1);

            System.out.println("Total Amount after addition: " + money.getAmount());
            System.out.println("Account Balance: " + bankAccount.getBalance());
        }
    }

