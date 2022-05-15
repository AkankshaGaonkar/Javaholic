interface exam //Or Abstract Class
{
    void display();
}
class Outerr
{
    public void meth()
    {
        exam m = new exam() { //anonymous class
            @Override
            public void display() {
                System.out.println("hello");
            }
        };
        m.display();
    }
}
public class anonymousClass {
}
