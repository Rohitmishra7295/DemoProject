import java.util.Scanner;

public class FindingLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Initializing max_element with the first element of the array
        int max_element = arr[0];
        //initializing min_element with the first element
        int min_element=arr[0];
        // Loop through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max_element) {
                max_element = arr[i];
            }
        //loop through the array to find minimum element
            if(arr[i]<min_element){
                min_element=arr[i];
            }
        }
        
        // Output the largest element
        System.out.println("The largest element is: " + max_element);
        System.out.println("The smallest element is: " + min_element);

        // Optional: Print all elements
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
        // Close the scanner
        sc.close();
    }
}
