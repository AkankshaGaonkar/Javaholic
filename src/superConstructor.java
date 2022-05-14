class rec{
    int length;
    int breath;
    int x=10;

    rec(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }
}
class cuboid extends rec
{
    int height;
    int x=20;
    cuboid(int l ,int b,int h) {
        super(l, b);
        height = h;
    }
    int display()
    {
        System.out.println(super.x);
        System.out.println(x);

        return 0;
    }
}
public class superConstructor {
    public static void main(String args[]) {
        cuboid c = new cuboid(3, 4, 5);
        System.out.println(c.display());
    }
}
