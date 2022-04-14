import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        System.out.println("All Prime Numbers are:");
        int n=100;
        System.out.println("2");
        for(int i=2;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(+i);
            }
        }


    }
}
