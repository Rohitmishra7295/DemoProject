/*1.you are given a number n1,representing the size of array a1
 * 2. you are given n1 numbers,representing elements of array a1
 * 3.you are given a number n2,representing the size of array a2
 * 4. you are given n2 numbers,representing elements of array a2
 * 5.the two arrays represent digits of two numbers
 * you are required to add the numbers represented by two arrays and point the arrays
 * 
#############Constraints
 *           1<=n1,n2<=100
 *           0<=a1[i],a2[i]<10
 */

import java.util.Scanner;
public class ArrayAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //array 1
        System.out.println("Enter array size of first array");
        int n1=sc.nextInt();
        int arr1[] =new int[n1];

        for(int i=0;i<arr1.length;i++){
            System.out.println("enter elements of first array");
            arr1[i]=sc.nextInt();
        }

        //array 2
        System.out.println("Enter array size of second array");
        int n2=sc.nextInt();
        int arr2[] =new int[n2];

        for(int i=0;i<arr2.length;i++){
            System.out.println("enter elements of second array");
        arr2[i]=sc.nextInt();
        }


        ///////////////////1st method////////////////////////////
       // Determine the maximum size for the result array
       int maxSize = Math.max(n1, n2);
       int[] sum = new int[maxSize + 1]; // Extra space for possible carry
       int carry = 0;

       int i = arr1.length - 1;
       int j = arr2.length - 1;
       int k = sum.length - 1;

       // Perform addition
       while (i >= 0 || j >= 0 || carry > 0) {
           int d = carry; // Start with carry

           if (i >= 0) {
               d += arr1[i];
               i--;
           }

           if (j >= 0) {
               d += arr2[j];
               j--;
           }

           carry = d / 10;  // Update carry
           sum[k] = d % 10; // Store the last digit of sum
           k--;
       }

       // Print the result array
       System.out.print("Result: ");
       for (int val : sum) {
           if (val != 0 || k < sum.length - 1) { // Skip leading zeros
               System.out.print(val + " ");
           }
       }


        // *****************2nd method***********************

    //  // Reverse the arrays
    //  int[] reversedA1 = new int[n1];
    //  int[] reversedA2 = new int[n2];
     
    //  for (int i = 0; i < n1; i++) {
    //      reversedA1[i] = arr1[n1 - 1 - i];
    //  }
     
    //  for (int i = 0; i < n2; i++) {
    //      reversedA2[i] = arr2[n2 - 1 - i];
    //  }
    //  // Determine the maximum length of the result array
    //  int maxLen = Math.max(n1, n2);
    //  int[] result = new int[maxLen + 1]; // Extra space for carry
    //  int carry = 0;

    //  // Perform digit-wise addition
    //  for (int i = 0; i < maxLen; i++) {
    //      int digit1 = i < n1 ? reversedA1[i] : 0;
    //      int digit2 = i < n2 ? reversedA2[i] : 0;
    //      int sum = digit1 + digit2 + carry;
         
    //      result[i] = sum % 10;
    //      carry = sum / 10;
    //  }
    //   // Handle last carry
    //   if (carry > 0) {
    //     result[maxLen] = carry;
    // }
    
    // // Reverse the result to get the correct order
    // int resultLength = (carry > 0) ? maxLen + 1 : maxLen;
    // for (int i = 0; i < resultLength; i++) {
    //     System.out.print(result[resultLength - 1 - i] + " ");
    // }
    }
}
