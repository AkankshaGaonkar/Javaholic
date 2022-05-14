class rectangle{
    int length;
    int breath;
    rectangle(int length, int breath)
    {
        this.length=length;//to avoid name conflict that is parameter and property have same name so this constructor is used to resolve this issue
        //this gives ref to current obj
        this.breath=breath;
    }
    boolean display()
    {
        System.out.println("length"+this.length);
        System.out.println("breath"+this.breath);
        return false;
    }
}
public class thisConstructor {
    public static void main(String args[]) {
        rectangle r = new rectangle(2,5);
        System.out.println(r.display());

    }
}
