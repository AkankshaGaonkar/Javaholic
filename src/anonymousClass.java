interface exam //Or Abstract Class
{
    void display();
}
class Outerr
{
    public void meth()
    {
        /*exam m = new exam() { //anonymous class
            @Override
            public void display() {
                System.out.println("hello");
            }
        };
        m.display();*/
        new exam(){public void display(){System.out.println("hello");}}.display();

    }
}
public class anonymousClass {
    public static void main(String args[])
    {
        Outerr o = new Outerr();
        o.meth();
    }
}
