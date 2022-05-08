public class MaxEleInArray
{
    static int max(int A[])
    {
        int max=A[0];
        for(int i=1;i<A.length;i++)
        {
            if(max<A[i])
            {
                max=A[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int A[]={8,3,15,9,77};
        System.out.println(max(A));
    }
}
