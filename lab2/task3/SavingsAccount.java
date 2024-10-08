package lab2.task3;

public class SavingsAccount extends Account {
    private double interestValue;

    SavingsAccount(int accountNumber, double interestValue) {
        super(accountNumber);
        this.interestValue = interestValue;
    }

    public double getInterestValue() {
        return interestValue;
    }

    public void setInterestValue(double interestValue) {
        this.interestValue = interestValue;
    }

    public void addInterest() {
        double numToAdd = this.getBalance() * (interestValue / 100);
        this.deposit(numToAdd);
    }

    @Override
    public String toString() {
        return "Savings account [interest value: " + interestValue + "], " + super.toString();
    }
}
