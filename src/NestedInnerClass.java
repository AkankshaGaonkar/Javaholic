class Outer
{
    int x=10;
    class Inner
    {
        int y=20;
        void innerDisplay()
        {
            System.out.println(x);//10 (Executed 4)
            System.out.println(y);//20 (Executed 5)
        }
    }
    void OuterDisplay()
    {
        int a=3;
        System.out.println(x);//10 (Executed 1)
        System.out.println(a);//3 (Executed 2)
        Inner i=new Inner();
        i.innerDisplay(); // (Executed 3)
        System.out.println(i.y);//ref of inner class //20 (6)
    }
}
public class NestedInnerClass{
    public static void main(String args[]){
        Outer o = new Outer();
        o.OuterDisplay();
        Outer.Inner i = new Outer().new Inner();//syntax to access inner class into main
        System.out.println(i.y); //20 (Executed 7)
        System.out.println(o.x); //10 (Executed 8)
    }
}
