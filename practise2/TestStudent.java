package practise2;

public class TestStudent {
    public static void main(String[] args) {
        Student iluha = new Student("Iluha", 23);
        System.out.println(iluha.getName());
        System.out.println(iluha.getId());
        System.out.println(iluha.incrementYearOfStudy());
    }
}
