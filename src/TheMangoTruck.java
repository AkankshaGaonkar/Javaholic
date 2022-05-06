import java.util.Scanner;

public class TheMangoTruck {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            int t,x,y,z;
            Scanner sc=new Scanner(System.in);
            t=sc.nextInt();
            while(t-->0)
            {
                x=sc.nextInt();
                y=sc.nextInt();
                z=sc.nextInt();
                System.out.println((z-y)/x);

            }

        }
}

