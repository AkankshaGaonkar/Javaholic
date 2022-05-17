class singleThreadClass extends Thread//main thread and user defined thread are in same one class
{
    public void run()//overriding the run method
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String args[])
    {
        singleThreadClass t =new singleThreadClass();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
}


