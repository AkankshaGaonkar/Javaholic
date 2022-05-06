import java.util.Scanner;

public class YoungOrOld {
    public static void main(String args[]){
        int age;
        System.out.println("Enter the age of the person");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age >= 14 && age <= 55)
        {
            System.out.println("Person is young");

        } else
        {
            System.out.println("Person is Old");
        }
    }
}
