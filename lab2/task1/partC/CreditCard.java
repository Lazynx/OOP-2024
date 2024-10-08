package lab2.task1.partC;

import java.util.Date;
import java.util.Objects;

public class CreditCard extends BankCard {
    private int creditSum;

    public CreditCard() {}

    public CreditCard(String cardNumber, String cardOwner, double balance, int creditSum) {
        super(cardNumber, cardOwner, balance);
        this.creditSum = creditSum;
    }

    public int getCreditSum() {
        return creditSum;
    }

    public void setCreditSum(int creditSum) {
        this.creditSum = creditSum;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        CreditCard that = (CreditCard) obj;
        return Objects.equals(creditSum, that.creditSum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), creditSum);
    }

    @Override
    public String toString() {
        return "Credit card [credit sum: " + creditSum + "], " + super.toString();
    }
}
