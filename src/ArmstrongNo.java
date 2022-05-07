import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String args[]){
        int ans=0,n,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        n=sc.nextInt();
        int m=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            ans= ans+r*r*r;
        }
        if(ans==m)
            System.out.println("armstrong");
        else
            System.out.println("not an armstrong");
    }
}
