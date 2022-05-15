class outerrr
{
    public void display()
    //inside the display mtd we have an inner class
    {
        class inner
        {
            public void innerDisplay()
            {
                System.out.println("Hello");
            }

        }
        inner i = new inner();
        i.innerDisplay();
    }
}
public class localInnerClass {
    public static void main(String  args[])
    {
        outerrr o = new outerrr();
        o.display();
    }
}
