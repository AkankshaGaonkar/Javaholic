import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String  args[]){
        int count=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        n=sc.nextInt();
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);

    }
}
