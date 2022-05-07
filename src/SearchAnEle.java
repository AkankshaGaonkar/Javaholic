import java.util.Scanner;

public class SearchAnEle {
    public static void main(String args[]) {
        int key ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        key=sc.nextInt();
        int arr[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("key found at index "+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }
}

