public class MtdOverloading3 {
    static boolean validate(String name)
    {
        return name.matches("[a-zA\\s+]");
    }
    static boolean validate(int age)
    {
        return age<=3 || age<=15;
    }


    public static void main(String[] args)
    {
        System.out.println(validate("Akanksha"));
        System.out.println(validate(10));
    }

}
