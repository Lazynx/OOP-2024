package lab3.task4;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getHireDate().compareTo(o2.getHireDate());
    }
}
