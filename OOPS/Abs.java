abstract class Exp
{
    abstract void hide();
    
}
class Abs extends Exp
{
    void hide()
    {
        System.out.println("abstract class");
    }
    public static void main(String[] args) {
        Abs obj = new Abs();
        obj.hide();
    }
}
