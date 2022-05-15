abstract class shape//only ref not obj can be created
{
    abstract public int perimeter();
    abstract public int area();
}
class circle extends shape{
    int radius;
    public int area()//y we can't declare radius inside parenthesis
    {
        return radius*radius;
    }
    public int perimeter()
    {
        return 2*radius;
    }

}
class rect extends shape
{
    int length, breath;
    public int area()
    {
        return (length*breath);
    }
    public int perimeter()
    {
        return (2*(length+breath));
    }


}

public class egForAbstractClass {
    public static void  main(String args[]){
        circle c= new circle();
         rect r = new rect();
         r.length=10;
         r.breath=2;
         c.radius=3;
         shape s =c;//dynamic mtd dispatch
         System.out.println(s.area());
        System.out.println(c.perimeter());
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }

}
