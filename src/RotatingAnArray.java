public class RotatingAnArray {
    public static void main(String args[]){
        int A[]={5,4,3,8,3,9,10,377,49};
        for(int i=0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
        int temp=A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for(int i=0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }
    }
}
