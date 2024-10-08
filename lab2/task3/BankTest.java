package lab2.task3;

public class BankTest {
    public static void main(String[] args) {
        Bank halyk = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1001, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount(1002);
        Account account = new Account(1003);

        halyk.openAccount(savingsAccount);
        halyk.openAccount(checkingAccount);
        halyk.openAccount(account);

        savingsAccount.deposit(500);
        checkingAccount.deposit(200);
        checkingAccount.withdraw(50);
        account.deposit(300);

        System.out.println("Before update:");
        savingsAccount.print();
        checkingAccount.print();
        account.print();

        halyk.update();

        System.out.println("\nAfter update:");
        savingsAccount.print();
        checkingAccount.print();
        account.print();
    }
}