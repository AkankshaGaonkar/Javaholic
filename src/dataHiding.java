class square
{
    private int length;
    public int getLength()
    {
        return length;
    }
    public void setLength(int l)
    {
        if(l>0)
        {
            length=l;
        }
        else
        {
            length=0;
        }
    }
    public int area()
    {
        return length*length;
    }
}
public class dataHiding {
    public static void main(String args[])
    {
        square s = new square();
        s.setLength(10);
        System.out.println("Area of square is "+s.area());
    }

}
