public class BinarySearch {
   public static void main(String[] args) {
       int[] arr={2,3,4,6,8,9,13,14,17,20,25,30};
       int target=17;
       System.out.println(returnTarget(arr,target));
   } 

// return the index
// return -1 if it does not exist
   static int  returnTarget(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
// find the middle element
//int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java            
            
            int middle=start+(end-start)/2; //better way

            if(target==arr[middle]){
                return middle;
            }
            else if(target>arr[middle]){
                 start=middle+1;
            }
            else{
                 end=middle-1;
            }
        }
        return -1;
   }
}
