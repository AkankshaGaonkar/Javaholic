import java.util.Scanner;

public class RootsOfQuadraticEquations {
    public static void main(String args[]){
        int a,b,c;
        double r1,r2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of the equation");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        r1=(-b+Math.sqrt((b*b)-4*a*c))/(2*a);
        r2=(-b-Math.sqrt((b*b)-4*a*c))/(2*a);
        System.out.println("Root of R1 is:"+r1);
        System.out.println("Root of R2 is:"+r2);
    }
}
