import java.util.Scanner;

public class Grades {
    public static void main(String args[]){
        int m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the m1,m2,m3 mark");
        m1= sc.nextInt();
        m2= sc.nextInt();
        m3= sc.nextInt();
        float avg=(float)(m1+m2+m3)/3;
        if(avg>=70){
            System.out.println("A GRADE");
        }
        else if(avg>=60 && avg<70) {
            System.out.println("B GRADE");
        }
        else if(avg>=50 && avg<60){
            System.out.println("C GRADE");
        }
        else if(avg>=40 && avg<50){
            System.out.println("D GRADE");
        }
        else if(avg<40){
            System.out.println("F GRADE");
        }
        else{
            System.out.println("FAIL");
        }
    }
}


