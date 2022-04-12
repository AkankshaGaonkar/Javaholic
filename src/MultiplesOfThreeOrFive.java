import java.util.Scanner;

public class MultiplesOfThreeOrFive {
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = num.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++)
        {
            sum=sum+i;
            if(sum % 3 == 0 || sum % 5 ==0)
            {
                System.out.println("The number that is divisible by 3 or 5 are " + sum);
            }
        }
    }
}
