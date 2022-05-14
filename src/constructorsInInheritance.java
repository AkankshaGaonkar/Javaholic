class parent
{
    public parent()
    //constructor
    {
        System.out.println("Parent Constructor");
    }
}
//child class inherit the property from the parent class
class child extends parent
{
    public child()
    {
        System.out.println("Child Constructor");
    }
}
class grandchild extends child
{
    public grandchild()
    {
        System.out.println("Grandchild constructor");
    }
}
public class constructorsInInheritance {
    public static void main(String args[])
    {
        grandchild a=new grandchild();
    }

}
