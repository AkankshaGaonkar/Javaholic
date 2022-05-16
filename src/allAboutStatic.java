class Testt {  //Only inner class can be static
    static int x=10;//Only one copy by shared by all the ref objects and methods
    int y=20;
    void show()
    {
        System.out.println(x+" "+y);
    }
    static void display()
    {
        System.out.println(x);//can access only static members
    }
}


public class allAboutStatic {
    public static void main(String args[])
    {
        Testt t1=new Testt();
        t1.show();
        t1.x=30;
        t1.y=40;//it will not execute since t2 has its own value
        Testt t2= new Testt();
        t2.show();
    }

}
