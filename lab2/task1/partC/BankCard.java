package lab2.task1.partC;

import java.util.Objects;

public class BankCard {
    private String cardNumber;
    private String cardOwner;
    private double balance;

    public BankCard() {}

    public BankCard(String cardNumber, String cardOwner, double balance) {
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankCard that = (BankCard) o;
        return balance == that.balance && Objects.equals(cardNumber, that.cardNumber) && Objects.equals(cardOwner, that.cardOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cardOwner, balance);
    }

    @Override
    public String toString() {
        return "BankCard [card number: " + cardNumber + ", card owner: " + cardOwner + ", balance: " + balance + "]";
    }
}
