import java.util.Scanner;

public class Panlindrone {
    public static void main(String args[]){
        int ans=0,n,r,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        n=sc.nextInt();
        int m=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==m)
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a Palindrome");

    }
}

