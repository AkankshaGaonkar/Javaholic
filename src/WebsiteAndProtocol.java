import java.util.Scanner;

public class WebsiteAndProtocol {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a url");
        String url=sc.nextLine();
        int i=url.indexOf(":");
        String name =url.substring(0,i);
        if(name.equals("https"))
        {
            System.out.println("Hyper Text Markup Language");
        }
        else if(name.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }
        int j=url.lastIndexOf(".");
        String username=url.substring(j,url.length());
        if(username.equals(".com"))
        {
            System.out.println("Commercial");
        }
        else if(username.equals(".org"))
        {
            System.out.println("Organization");
        }
        else if(username.equals(".net"))
        {
            System.out.println("Network");
        }
        else if(username.equals(".gov"))
        {
            System.out.println("Government");
        }
    }
}
