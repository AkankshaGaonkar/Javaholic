import java.util.Scanner;

public class GreetWithName {
    public static void main (String args[])
    {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String username = name.nextLine();
        System.out.println("Good Morning "+ username);
    }
}
