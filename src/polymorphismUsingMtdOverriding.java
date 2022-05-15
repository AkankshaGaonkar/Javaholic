class supp {
    protected void display() {
        System.out.println("Super Display");
    }

}
class subb extends supp
{
    public void display()
    {
        System.out.println("Sub Display");
    }
}
public class polymorphismUsingMtdOverriding {
    public static void main(String args[])
    {
        supp s=new supp();
        supp su=new subb();
        s.display();
        su.display();
    }
}