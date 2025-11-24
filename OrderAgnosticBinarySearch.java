public class orderAgnosticBinarySearch {

    public static void main(String[] args) {
        // Array is sorted in descending order
        int[] arr = {32 , 23 , 17 , 15 , 13 , 7 , 6 , 3 , 1};
        
        int target = 13;   // Number we want to search
        System.out.println(returnTarget(arr, target));
    }

    static int returnTarget(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // Check if array is descending or ascending
        // If first element > last element --> descending
        boolean isTrue = arr[start] > arr[end];

        // Standard binary search loop
        while(start <= end) {

            // Prevent potential integer overflow
            int middle = start + (end - start) / 2;

            // If middle element is target → return its index
            if(arr[middle] == target) {
                return middle;
            }

            // CASE 1: Array is in descending order
            if(isTrue) {

                // If target is larger than middle element → go LEFT
                if(target > arr[middle]) {
                    end = middle - 1;
                }
                // Otherwise → go RIGHT
                else {
                    start = middle + 1;
                }
            }

            // CASE 2: Array is in ascending order
            else {

                // If target is larger → search RIGHT side
                if(target > arr[middle]) {
                    start = middle + 1;
                }
                // Otherwise → search LEFT side
                else {
                    end = middle - 1;
                }
            }
        }

        // Target not found
        return -1;
    }
}
