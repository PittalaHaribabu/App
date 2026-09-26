interface interface1 {
    void method1();
}

public class Interf implements interface1 {
    public void method1() {
        System.out.println("Method implementation");
    }
    public static void main(String[] args) {
        Interf obj = new Interf();
        obj.method1();
    }
}
