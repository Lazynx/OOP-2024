package lab2.task1.partC;

import java.util.HashSet;

public class CardTest {
    public static void main(String[] args) {
        HashSet<BankCard> cards = new HashSet<>();

        BankCard bankCard1 = new BankCard("0001 0002 0003 0004", "Iluha", 50);
        BankCard bankCard2 = new BankCard("0011 0022 0033 0044", "Vlad", 100);
        BankCard bankCard3 = new BankCard("0001 0002 0003 0004", "Iluha", 50);

        CreditCard creditCard1 = new CreditCard("0001 0002 0003 0004", "Iluha", 50, 100);
        CreditCard creditCard2 = new CreditCard("0111 0222 0333 0444", "Aruzhan", 20, 900);
        CreditCard creditCard3 = new CreditCard("0001 0002 0003 0004", "Vlad", 50, 100);

        cards.add(bankCard1);
        cards.add(bankCard2);
        cards.add(bankCard3);

        cards.add(bankCard2);
        cards.add(creditCard1);
        cards.add(creditCard2);
        cards.add(creditCard3);

        for (BankCard card : cards) {
            System.out.println(card);
        }
    }
}
