public class SortingArrayOfStrings {
    public static void main(String[] args) {
        String arr[] = {"Java", "Python", "Cpp", "Ruby", "C", "JavaScript" };
        java.util.Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
