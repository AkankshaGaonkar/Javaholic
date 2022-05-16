public class MtdOverloading1 { //same name different parameters
    static double area(double l,double b)
    {
       double area=l*b;
       return area;
    }
    static int area(int r)
    {
        int are=r*r;
        return are;
    }
    public static void main(String args[])
    {
        System.out.println(area(7));
        System.out.println(area(4,7));
    }
}
