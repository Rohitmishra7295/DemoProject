/*revers content of an array */

import java.util.Scanner;
public class ReverseArray {

    public static int[] swapArray(int[] arr){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
       return arr;
    }
 public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size");
    int n=sc.nextInt();
    int arr[]=new int[n];

    System.out.println("Enter array elements");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt(); 
    }
    arr=swapArray(arr);

    System.out.println("reversed array");
    for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+"");
 }
}
}











/*public static int[] swapArray(int[] arr)

This is the method signature for the swapArray method.
public means the method can be accessed from outside the class.
static means the method can be called without creating an instance of the class.
int[] is the return type of the method, which means it returns an array of integers.
swapArray is the name of the method.
int[] arr is the input parameter of the method, which is an array of integers to be reversed.
int left = 0;

This line initializes a variable left to 0.
left will be used as an index to traverse the array from the beginning.
int right = arr.length - 1;

This line initializes a variable right to the last index of the array.
arr.length returns the length of the array, and subtracting 1 gives us the last index.
right will be used as an index to traverse the array from the end.
while (left < right)

This line starts a while loop that continues as long as left is less than right.
The loop will iterate until left meets or crosses right in the middle of the array.
int temp = arr[left];

This line creates a temporary variable temp and assigns it the value of the element at index left in the array.
This is done to swap the elements at left and right indices.
arr[left] = arr[right];

This line assigns the value of the element at index right to the element at index left in the array.
This is the first step in swapping the elements.
arr[right] = temp;

This line assigns the value of the temporary variable temp (which holds the original value of the element at index left) to the element at index right in the array.
This completes the swap of elements at left and right indices.
left++;

This line increments the left index by 1.
This moves the left index towards the center of the array.
right--;

This line decrements the right index by 1.
This moves the right index towards the center of the array.
return arr;

This line returns the modified array (which is now reversed).
Note that the original array is modified in-place, so this return statement is not strictly necessary. However, it's included for clarity and to match the method signature.
arr = swapArray(arr); (in the main method)

This line calls the swapArray method and passes the input array arr to it.
The method reverses the array in-place, and the modified array is assigned back to the arr variable.
System.out.println("Reversed array:"); (in the main method)

This line prints a message indicating that the reversed array is about to be printed.
for (int i = 0; i < arr.length; i++) (in the main method)

This line starts a for loop that iterates over the elements of the reversed array.
The loop will print each element of the array.
System.out.print(arr[i] + " "); (in the main method)

This line prints the current element of the array, followed by a space.
The print method is used instead of println to print all elements on the same line. */