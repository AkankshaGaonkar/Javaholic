public class SecondMax {
    public static void main(String args[]) {
        int arr[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int max1 = arr[0];
        int max2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}


