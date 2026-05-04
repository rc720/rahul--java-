package q4;

class BankAccount {
    private double balance;
    BankAccount(double initialBalance) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    void deposit(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        balance += amount;

        assert balance > 0 : "Balance must be positive after deposit";
    }

    void withdraw(double amount) {

        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }

        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(1000);

        acc.deposit(500);
        System.out.println(acc.getBalance());

        acc.withdraw(200);
        System.out.println(acc.getBalance()); 
    }
}
