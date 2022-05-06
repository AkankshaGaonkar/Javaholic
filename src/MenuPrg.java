import java.util.Scanner;

public class MenuPrg {
    public static void main(String args[]){
        int a,b;
        String option;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Option:ADD,SUB,MUL,DIV");
        option=sc.nextLine();
        switch(option){
            case "ADD":
                System.out.println(a+b);
                break;
            case "SUB":
                System.out.println(a-b);
                break;
            case "MUL":
                System.out.println(a*b);
                break;
            case "DIV":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
