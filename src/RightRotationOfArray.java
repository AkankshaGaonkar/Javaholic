public class RightRotationOfArray {
    public static void main(String args[]){
        int A[]={5,9,6,10,12,7,3,5,4,2};

        int temp=A[9];
        for(int i = A.length-1;i>0; i--)
        {
            A[i]=A[i-1];
        }
        A[0]=temp;
        for(int i=0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }

    }
}
