import java.util.Scanner;

public class ATMInterface {
    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public String withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return "Withdrew: Rs" + amount + "\nNew Balance: Rs" + balance;
            } else if (amount > balance) {
                return "Insufficient funds. Current balance: Rs" + balance;
            } else {
                return "Invalid amount. Please enter a positive number.";
            }
        }

        public boolean deposit(double amount) {
            if (amount > 0) {
                balance = balance + amount;
                System.out.println(balance);
                return true;
            } else {
                System.out.println("enter a positive number.");
                return false;
            }
        }

        public double checkBalance() {
            return balance;
        }
    }

    public static class ATM {
        final BankAccount account;

        public ATM(BankAccount account) {
            this.account = account;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            BankAccount myAccount = new BankAccount(2000);
            ATM atm = new ATM(myAccount);

            while (true) {
                System.out.println("***** ATM *****");
                System.out.println("1. CHECK BALANCE");
                System.out.println("2. DEPOSIT");
                System.out.println("3. WITHDRAW");
                System.out.println("4. EXIT");
                System.out.print("CHOOSE AN OPTION: ");

                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(atm.checkBalance());
                        break;
                    case 2:
                        System.out.print("ENTER AMOUNT TO BE DEPOSITED: ");
                        double depositAmount = in.nextDouble();
                        System.out.println(atm.deposit(depositAmount));
                        break;
                    case 3:
                        System.out.print("ENTER AMOUNT TO BE WITHDRAWN: ");
                        double withdrawAmount = in.nextDouble();
                        System.out.println(atm.withdraw(withdrawAmount));
                        break;
                    case 4:
                        System.out.println("EXIT");
                        in.close();
                        return;
                    default:
                        System.out.println("INVALID");
                }
            }
        }

        public String withdraw(double amount) {
            return account.withdraw(amount);
        }

        public boolean deposit(double amount) {
            return account.deposit(amount);
        }

        public double checkBalance() {
            return account.checkBalance();
        }
    }
}




