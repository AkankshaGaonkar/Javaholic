import java.util.Scanner;

public class Tables {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number to display the tables of that number:");
        int n = num.nextInt();
        if (n <= 12) {
            for (int i = 1; i <= 10; i++) {
                int ans = n * i;
                System.out.println(+n + "*" + i + "=" + ans);
            }
        }
        else{
                System.out.println("Enter Number less than or equal to 12");
            }
        }
}

