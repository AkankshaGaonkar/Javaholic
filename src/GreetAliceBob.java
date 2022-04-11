import java.util.Scanner;

public class GreetAliceBob {
    public static void main (String args[])
    {
           Scanner name = new Scanner(System.in);
           System.out.println("Enter the name of the user:");
           String username = name.nextLine();
           String str1="Alice";
           String str2="Bob";
           if (username.equals(str1))
           {
               System.out.println("Good Morning "+username);
           }
           else if(username.equals(str2))
           {
               System.out.println("Good Morning " + username);
           }
           else
           {
               System.out.println("Good Morning");
           }


    }

}
