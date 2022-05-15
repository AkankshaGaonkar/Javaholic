class outer
{
    void display()//inside the display mtd we have an inner class
    {
        class inner
        {
            void innerDisplay()
            {
                System.out.println("Hello");
            }

        }
        inner i = new inner();
        i.innerDisplay();
    }
}
public class localInnerClass {

}
