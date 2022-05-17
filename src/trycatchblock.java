import java.util.Scanner;

public class trycatchblock {
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            c = a / b;
            System.out.println("Addition of 2 numbers is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error");
            System.out.println("Denominator should not be zero!Try Again baby:)");
        }
    }
}
