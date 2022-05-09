import java.util.Scanner;

public class Array_NoIsPrime
{
    static boolean isPrime(int n)
    {
        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        if(isPrime(7))
            System.out.println("7 is a prime no");
        else
            System.out.println("7 is not prime");
    }
}

