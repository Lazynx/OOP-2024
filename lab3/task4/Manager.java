package lab3.task4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Comparable<Employee>, Cloneable {
    private Vector<Employee> team = new Vector<>();
    private Double bonus;

    public Manager() {}

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, Double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
    }

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, Double bonus, Vector<Employee> team) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = team;
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    public void setTeam(Vector<Employee> team) {
        this.team = team;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        int salaryComparison = Double.compare(this.getSalary(), otherEmployee.getSalary());
        if (salaryComparison != 0) {
            return salaryComparison;
        }

        if (otherEmployee instanceof Manager) {
            Manager otherManager = (Manager) otherEmployee;
            return Double.compare(this.bonus, otherManager.getBonus());
        }

        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Manager m = (Manager) o;
        return team.equals(m.team);
    }

    @Override
    public String toString() {
        return "Manager [team=" + team + "], " + super.toString();
    }
}
