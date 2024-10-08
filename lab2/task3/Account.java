package lab2.task3;

public class Account {
    private double balance; // The current balance
    private int accNumber; // The account number

    Account(int a){
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        balance -= sum;
    }

    public double getBalance() {
        return balance;
    }

    public double getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if (balance >= amount) {
            this.withdraw(amount);
            other.deposit(amount);
        } else {
            System.out.println("You don't have enough funds!!!");
        }
    }

    @Override
    public String toString() {
        return "Account [balance: " + balance + ", accNumber: " + accNumber + "]";
    }

    public final void print() {
        System.out.println(toString());
    }
}
