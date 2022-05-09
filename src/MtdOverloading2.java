public class MtdOverloading2 {
    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = (rev*10)+(n % 10);
            n = n / 10;
        }
        return rev;
    }
    static int[] reverse(int[] arr) {
        int[] B =new int[arr.length];
        for(int i=arr.length-1,j=0;i>=0;i--,j++)
            B[j]=arr[i];
        return B;
    }

    public static void main(String[] args){
        int arr[]={11,2,3,4};
        System.out.println(reverse(753));
        int A[]=reverse(arr);
        for(int i=0;i<A.length;i++){
            if(i<=A.length-2)
                System.out.print(A[i]+", ");
            else
                System.out.print(A[i]);
        }
    }
}
