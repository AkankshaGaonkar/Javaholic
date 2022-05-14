class parent
{
    public parent()//constructor
    {
        System.out.println("Parent Constructor");
    }
}
class child extends parent//child class inherit the property from the parent class
{
    public child()
    {
        System.out.println("Child Constructor");
    }
}
class grandchild extends  child
{
    public grandchild()
    {
        System.out.println("Grandchild constructor");
    }
}
public class constructorsInInheritance {
    public static void  main(String args[])
    {
        child a=new grandchild();
    }

}
