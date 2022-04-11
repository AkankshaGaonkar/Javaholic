import java.util.Scanner;

public class SumOfNum {
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = num.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++)
        {

            sum=sum+i;

        }
        System.out.println("The Sum of is " +sum);

    }
}
