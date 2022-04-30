public class RemoveSpecialChar {
    public static void main(String args[]){
        String str ="This!is*Akanksha...%blessed+with$#beautyand&luck@.";
        str =str.replaceAll("[^a-zA-Z]","");
        System.out.println(str);
    }
}
