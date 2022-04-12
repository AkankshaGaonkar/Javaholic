import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfNumUsingFormula {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = obj.nextInt();
        System.out.println("Sum of number is:");
        System.out.println(n*(n+1)/2);


    }
}
