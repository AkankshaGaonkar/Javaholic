import java.util.Scanner;

public class RollerCoasterMinHeight {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t--> 0)
        {
            int x,h;
            x=sc.nextInt();
            h=sc.nextInt();
            if(x>=h)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
