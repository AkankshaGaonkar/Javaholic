import java.util.Scanner;

public class TypeOfLink {
    public static void main(String args[]){
        String url;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Url");
        url=sc.nextLine();
        int ext=url.lastIndexOf(".");
        String web=url.substring(ext+1,url.length());
        switch(web){
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organization");
                break;
            case "net":
                System.out.println("Network");
                break;
            case "gov":
                System.out.println("Government");
                break;
            default:System.out.println("Invalid");
        }
    }
}
