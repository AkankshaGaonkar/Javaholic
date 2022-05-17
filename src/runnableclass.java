class myclass implements Runnable
{
    public void run()
    {
        int i=1;
        while(i>0)
        {
            System.out.println(i+"monkey");
            i++;
        }
    }
}
public class runnableclass{
    public static void main(String args[])
    {
        myclass m = new myclass();//cabin
        Thread t = new Thread(m); //horse
        t.start();//horse rope (flow will go to Thread where it runs the runnable class and simultaneously current runnableclass will also run
        int i=1;
        while(true)
        {
            System.out.println(i+"Donkey");
            i++;
        }
    }
}
