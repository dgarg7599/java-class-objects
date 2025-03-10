import java.util.*;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        account.accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        account.accountNumber = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        account.balance = sc.nextDouble();

            System.out.print("Enter operation (withdraw/deposit): ");
            String operation = sc.next().toLowerCase();

            if (operation.equals("deposit")) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
            } else if (operation.equals("withdraw")) {
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);

            } else {
                System.out.println("Invalid operation.");
            }


        account.displayBalance();
        sc.close();
    }
}
/*Enter Account Holder Name: Divyansh
Enter Account Number: 26
Enter Initial Balance: 2000
Enter operation (withdraw/deposit): withdraw
Enter withdrawal amount: 1000
Amount Withdrawn: 1000.0
Account Holder: Divyansh
Account Number: 26
Current Balance: 1000.0
 */