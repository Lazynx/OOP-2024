package practise2;

public class TestTime {
    public static void main(String[] args) {
        Time error = new Time(25, 5, 6);
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(4, 24, 33);
        t.add(t2);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
    }
}
