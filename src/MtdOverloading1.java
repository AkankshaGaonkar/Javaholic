public class MtdOverloading1 {
    static double area(double l,double b)
    {
       double area=l*b;
       return area;
    }
    static double area(double r)
    {
        double area=(Math.PI)*r*r;
        return area;
    }
    public static void main(String args[])
    {
        System.out.println(area(7));
        System.out.println(area(4,7));
    }
}
