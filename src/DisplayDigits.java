import java.util.Scanner;

public class DisplayDigits {
    public static void main(String args[]){
        int r,n,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            System.out.println(r);
            n=n/10;
        }
    }
}
