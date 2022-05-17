class  MyThread extends Thread
{
    public void run()//run method is the starting point of the thread class just like main
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class ThreadClass {
    public static void main(String args[])
    {
        MyThread t=new MyThread();//create the obj of the thread class and call start method to make execute run method
        t.start();//start is builtin method of the thread class
        int i=1;
        while(true)
        {
            System.out.println(i+"world");
            i++;
        }
    }
}

