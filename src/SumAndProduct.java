import java.util.Scanner;

class SumAndProduct {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("To compute the sum enter 1 and to compute the product enter 2:");
        int b = sc.nextInt();
        if (b == 1) {
            int result = 0;
            for (int i = 1; i <= a; i++) {
                result += i;
            }
            System.out.println(result);
        } else if (b == 2) {
            int mult = 1;
            for (int i = 1; i <= a; i++) {
                mult = mult * i;
            }
            System.out.println(mult);
        } else {
            System.out.println("Incorrect");
        }
    }
}
