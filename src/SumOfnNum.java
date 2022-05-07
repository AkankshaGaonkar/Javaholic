import java.util.Scanner;

public class SumOfnNum {
    public static void main(String args[]){
    int sum=0,num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no");
    num=sc.nextInt();
    for(int i=1;i<=num;i++)
    {
        sum=sum+i;
    }
    System.out.println(sum);
    }
}
