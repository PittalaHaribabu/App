public class Inh3 extends Inh2{
    public void c()
    {
        System.out.println("class C");
    }
    public static void main(String[] args) {
        Inh3 obj = new Inh3();
        obj.a();
        obj.b();
        obj.c();
        
    }
}
