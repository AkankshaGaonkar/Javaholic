class Cylinder
{
    private int radius;//data hiding
    private int height;

    public int getRadius() {
        return radius;
    }//get and set property metds
    public int getHeight()
    {
        return height;
    }
    public void setRadius(int r)
    {
        r=radius;
    }
    public void setHeight(int h)
    {
         h=height;
    }
    public Cylinder() //constructor no return type,datatype and name is same as class name
    {
        radius=height=1;
    }
    public Cylinder(int r,int h)
    {
        radius=r;
        height=h;
    }
    public int area() //method with return type and datatype
    {
       return (int) (Math.PI*radius*radius);//type casting
    }
    public double volume()
    {
        return area()*height;
    }
}
public class constructorAndDataHiding {
    public static void main(String args[])
    {
        Cylinder c =new Cylinder();
        c.setHeight(10);
        c.setRadius(3);
        System.out.println("Area is "+c.area());
        System.out.println("Vol is "+c.volume());
    }
}
