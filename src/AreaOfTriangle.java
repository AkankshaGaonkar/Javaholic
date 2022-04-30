import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String args[]){
        float base,height,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base and height of the triangle");
        base=sc.nextFloat();
        height= sc.nextFloat();
        area=base*height/2;
        System.out.println("Area of the triangle is:"+area);
    }
}
