import java.util.Scanner;

public class ReverseNo {
    public static void main(String args[]){
    int ans=0,n,r;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no");
    n=sc.nextInt();
    while(n>0)
    {
        r=n%10;
        System.out.print(r);
        n=n/10;
    }
    }
}
