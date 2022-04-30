import java.util.Scanner;

public class AreaOfCuboid {
    public static void main(String args[]) {
        int l, b, h, tot_area, vol;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length,breath and height of the cuboid");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        vol = l * b * h;
        System.out.println("Volume of the cuboid is:" + vol);
        tot_area = 2*((l * h) + (b * h) + (l * b));
        System.out.println("Total Area of the cuboid is:" + tot_area);
    }
}

