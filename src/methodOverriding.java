class sup1{
    public void display()
        {
            System.out.println("hello");
        }
}
class sub1 extends sup1{
    public void display()
    {
        System.out.println("hello welcome");
    }
}
public class methodOverriding {
    public static void main(String args[])
    {
        sup1 su=new sup1();
        sub1 s=new sub1();
        su.display();
        s.display();
    }
}
