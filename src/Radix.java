import java.util.Scanner;

public class Radix {
    public static void main(String args[]){
        String num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num= sc.nextLine();
        if(num.matches("[01]+")){
            System.out.println("Radix 2");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("Radix 8");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("Radix 10");
        }
        else if(num.matches("[1-9A-F]+")){
            System.out.println("Radix 16");
        }
        else{
            System.out.println("Not a Number");
        }
    }
}
