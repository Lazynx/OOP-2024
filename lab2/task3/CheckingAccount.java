package lab2.task3;

public class CheckingAccount extends Account {
    private static final int FREE_TRANSACTIONS = 5;

    private int numberOfTransactions;

    CheckingAccount(int accountNumber) {
        super(accountNumber);
        this.numberOfTransactions = 0;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        numberOfTransactions++;
        deductFee();
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        numberOfTransactions++;
        deductFee();
    }

    @Override
    public void transfer(double amount, Account other) {
        super.transfer(amount, other);
        numberOfTransactions++;
        deductFee();
    }

    public void deductFee() {
        if (numberOfTransactions > FREE_TRANSACTIONS ) {
            if (this.getBalance() >= 0.02) {
                super.withdraw(0.02);
            } else {
                System.out.println("Deduction didn't work, you don't have enough funds!!!");
            }
        }
    }

    @Override
    public String toString() {
        return "Checking account [number of transactions: " + numberOfTransactions + ", number of free transactions: "+ FREE_TRANSACTIONS + "], " + super.toString();
    }
}
