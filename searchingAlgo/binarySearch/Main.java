public class Main {
    public static int binarySearch(int key, int arr[]) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end) {
            int mid = (start+end)/2; // You must recalculate mid inside the loop after start or end changes.
            if(arr[mid] == key) {
                return mid;
            }else if(arr[mid] < key) { // search on left side of an array
                start = mid + 1;
            }else { // search on right side of an array
                end = mid - 1;
            }
        }  

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,8,30}; // array should be sorted for binary search.

        System.out.println("Element is on index: " + binarySearch(8, arr));
       
    }
}