package lab3.task4;

import java.util.Date;
import java.util.UUID;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee() {}

    public Employee(String name) {
        super(name);
        this.salary = 0;
        this.hireDate = new Date();
        this.insuranceNumber = UUID.randomUUID().toString();
    }

    public Employee(String name, String insuranceNumber) {
        super(name);
        this.salary = 0;
        this.hireDate = new Date();
        this.insuranceNumber = insuranceNumber;
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
        this.hireDate = new Date();
        this.insuranceNumber = UUID.randomUUID().toString();
    }

    public Employee(String name, Date hireDate) {
        super(name);
        this.salary = 0;
        this.hireDate = hireDate;
        this.insuranceNumber = UUID.randomUUID().toString();
    }

    public Employee(String name, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = 0;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee clone = (Employee) super.clone();
        clone.setName(this.getName());
        clone.setSalary(this.getSalary());
        clone.setHireDate(this.getHireDate());
        clone.setInsuranceNumber(this.getInsuranceNumber());
        return clone;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return Double.compare(this.salary, otherEmployee.getSalary());
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Employee e = (Employee) o;
        return salary == e.salary && hireDate.equals(e.hireDate) && insuranceNumber.equals(e.insuranceNumber);
    }

    @Override
    public String toString() {
        return "Employee [salary=" + salary + ", hireDate=" + hireDate + ", insuranceNumber=" + insuranceNumber + "], " + super.toString();
    }
}
