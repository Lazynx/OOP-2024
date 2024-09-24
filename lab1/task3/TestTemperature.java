package lab1.task3;

public class TestTemperature {
    public static void main(String[] args) {
        // Test 1
        Temperature temp1 = new Temperature();

        System.out.println("TEST 1");
        System.out.println(temp1.getTemperatureC());
        System.out.println(temp1.getTemperatureF());
        System.out.println(temp1.getScale());

        // Test 2
        Temperature temp2 = new Temperature(32, 'C');
        System.out.println("TEST 2");
        System.out.println(temp2.getTemperatureC());
        System.out.println(temp2.getTemperatureF());

        // Test 3
        Temperature temp3 = new Temperature(22);
        System.out.println("TEST 3");
        System.out.println(temp3.getTemperatureC());
        System.out.println(temp3.getTemperatureF());

        // Test 4
        Temperature temp4 = new Temperature();
        temp4.setScale('F');
        temp4.setTemperature(18);

        System.out.println("TEST 4");
        System.out.println(temp4.getTemperatureC());
        System.out.println(temp4.getTemperatureF());
        System.out.println(temp4.getScale());

        // Test 5
        Temperature temp5 = new Temperature('C');
        temp5.setTemperatureScale(5, 'F');

        System.out.println("TEST 5");
        System.out.println(temp5.getTemperatureC());
        System.out.println(temp5.getTemperatureF());
        System.out.println(temp5.getScale());
    }
}
