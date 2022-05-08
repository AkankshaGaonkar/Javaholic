public class DeletingAnArray {
    public static void main(String args[]){
        int A[]=new int[10];
        A[0]=5;A[1]=9;A[2]=6;A[3]=10;A[4]=12;A[5]=7;
        int index=1,n=5;
        int temp=A[1];
        for(int i =2;i<=n; i++)
        {
            A[i-1]=A[i];
        }
        for(int i=0;i<n;i++) {
            System.out.print(A[i]+" ");
        }

    }
}




