public class removespecialchar {
    public static void main(String args[]){
        String str ="This!is*Akanksha...%blessed+with$#beautyand&luck@.";
        str =str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }
}
