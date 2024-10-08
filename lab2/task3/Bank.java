package lab2.task3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public Bank(Vector<Account> accounts) {
        this.accounts = accounts;
    }

    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductFee();
            }
        }
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public void closeAccount(int accNumber) {
        accounts.removeIf(account -> account.getAccountNumber() == accNumber);
    }

    @Override
    public String toString() {
        return "Bank [accounts: " + accounts.toString() + "]";
    }
}
