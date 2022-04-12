import java.util.Scanner;

public class MultiplesOfThreeOrFive {
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = num.nextInt();
        int sum=0;
        for (int no = 0; no < n; no++)
        {
            if (no % 3 == 0 || no % 5 == 0)
            {
                System.out.print(no + " ");
                sum=sum+no;
            }
        }
        System.out.println("\nThe sum of the numbers that are divisible by 3 or 5 is "+sum);
        }
}

