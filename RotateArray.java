/*you are given a num n,representing the size of array a.
 * you are given n numbers,representing elements of array a
 * you are given a num k
 * rotate the array a,k times to the right(for +ve value of k),and to left for -Ve value of k
 */

public class RotateArray {
    public static int[] rotateArray(int[] arr, int k) {
        
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
    
        // Reverse entire array
        reverse(arr, 0,arr.length-k-1);
    
        // Reverse first k elements
        reverse(arr, arr.length-k, arr.length - 1);
    
        // Reverse remaining elements
        reverse(arr, 0, arr.length - 1);
    
        return arr;
    }
    
    public static void reverse(int[] arr, int i, int j) {

        int start=i;
        int end=j;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
