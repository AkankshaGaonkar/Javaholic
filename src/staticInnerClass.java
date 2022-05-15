class Out
{
    static  int x=10;
    int y=20;
    static class In
    {
        void display()
        {
            System.out.println(x);
            //System.out.println(y); non-static member
        }
    }
}
public class staticInnerClass {
    public static void main(String args[]) {
        Out.In i = new Out.In();//directly accessed without creating the object of the out class
        i.display();
    }
}

