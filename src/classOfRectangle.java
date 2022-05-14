
    class Rectangle {
        public int length;
        public int breath;

        public int area() {
            return length * breath;
        }

        public int perimeter() {
            return 2 * (length + breath);
        }
    }
    public class classOfRectangle{
        public static void main(String args[])
        {
        Rectangle r1 = new Rectangle();
        r1.length=20;
        r1.breath=10;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        }
}
