class add//a class having two methods having same names but the number of arguments & return type are different that is name is same but action is different (polymorphism)
{
    public int sum(int a,int b)
    {
        return a+b;
    }
    public double sum(double a, double b, double c)
    {
        return a+b+c;
    }
}

public class polymorphismUsingMtdOverloading {
    public static void main(String args[])
    {
        add a = new add();//creating the obj of class add
        System.out.println(a.sum(2,4));//which mtd to call is decided during the compile time only by the compiler
        System.out.println(a.sum(34.5,5.6,5.7));
    }
}
