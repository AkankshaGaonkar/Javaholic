abstract  class Superr
{
    Superr() //constructor
    {
        System.out.println("Super");
    }
    void meth1(){
        System.out.println("Super Method1");
    }
    abstract void meth2();
}
class Subb extends Superr
{
    void meth2()
    {
        System.out.println("Sub Method2");
    }
}
public class abstractClass {
    public static void main(String args[])
    {
        Superr s =new Subb();//you can only create the obj of the subclass.Mainly abstract class is used for inheritance so that another class can override(to make it concrete methods) the mtds and create obj and functions to execute
        s.meth1();
        s.meth2();

    }
}

