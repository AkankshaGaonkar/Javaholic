class rectangle1 {
    int length=100;
    int breath=200;
    rectangle1()
    {
        int length;
        int breath;
        length=16;
        breath=13;
        System.out.println("length="+this.length);
        System.out.println("breath="+this.breath);

    }

    rectangle1(int length, int breath)
    {
        this.length=length;//to avoid name conflict that is parameter and property have same name so this constructor is used to resolve this issue
        //this gives ref to current class instance variable
        this.breath=breath;
    }
    void display()
    {
        System.out.println("length="+this.length);
        System.out.println("breath="+this.breath);

    }
}
public class thisConstructor {
    public static void main(String args[]) {
        rectangle1 rr = new rectangle1();

        rectangle1 r = new rectangle1(2,5);
        r.display();
    }
}
