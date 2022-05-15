interface Test
{
    void meth1();
    void meth2();
}
class Test2 implements Test
{
    public void meth1()
    {
        System.out.println("Meth1 of class test2");
    }
    public void meth2()
    {
        System.out.println("Meth2 of class test2");
    }
    public void meth3()
    {
        System.out.println("Meth3 of class test3");
    }

}
public class JavaInterface {
    public static void main(String args[]){
       Test t=new Test2();
       t.meth1();
       t.meth2();
    }
}
