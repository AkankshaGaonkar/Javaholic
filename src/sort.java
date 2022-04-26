public class sort {
    public static void main(int[] args){
        int low=0;
        int high=args.length-1;
        int temp;
        int mid=0;
        while(mid <= high){
            switch (args[mid]){
                case 0: {
                    temp = args[0];
                    args[0] = args[mid];
                    args[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2: {
                    temp = args[mid];
                    args[mid] = args[high];
                    args[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}


