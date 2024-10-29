package practise6;

public class Student extends Person implements CanHavePizza {
    private double balance = 10000;

    public Student() {}

    public Student(String name, int age, double balance) {
        super(name, age);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void eatPizza() {
        if (balance >= 100) {
            balance -= 100;
            System.out.println("Student has eaten pizza, it costs 100tg");
        } else {
            System.out.println("Student has not eaten pizza, no money ;(");
        }
    };

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Student s = (Student) o;
        return balance == s.balance;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result =  31 * result + (int) balance;
        return result;
    }

    @Override
    public String toString() {
        return "Student [balance=" + balance + "], " + super.toString();
    }
}
