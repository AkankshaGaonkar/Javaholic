
class sup{
    public void display()
    {
        System.out.println("hello");
    }
}
class sub extends sup {
    public void display()
    {
        System.out.println("hello welcome");
    }
}
public class dynamicMethodDispatch {
    public static void main(String args[]) {
        sup su = new sub();//super class ref holding an object of the subclass and an overrided method is called(ie subclass) then the mtd of obj is called DYNAMIC MTD DISPATCH
        su.display();
    }
}
