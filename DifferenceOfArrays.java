/*1.you are given a number n1,representing the size of array a1
 * 2. you are given n1 numbers,representing elements of array a1
 * 3.you are given a number n2,representing the size of array a2
 * 4. you are given n2 numbers,representing elements of array a2
 * 5.the two arrays represent digits of two numbers
 * you are required to find the difference of two numbers represented by two arrays and print the arrays a2-a1
 * 
 * assume - number represented by a2 is greater
 * 
#############Constraints
 *           1<=n1,n2<=100
 *           0<=a1[i],a2[i]<10
 */
import java.util.Scanner;
public class DifferenceOfArrays {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        //array a2
        System.out.println("Enter the array size of Array a1");
        int n1=sc.nextInt();
        int a1[]=new int[n1];

        for(int i=0;i<a1.length;i++){
            System.out.println("Enter elements of array a1");
            a1[i]=sc.nextInt();
        }
        
        //array a1
        System.out.println("Enter the array size of Array a2");
        int n2=sc.nextInt();
        int a2[]=new int[n2];

        for(int i=0;i<a2.length;i++){
            System.out.println("Enter the elements of array a2");
            a2[i]=sc.nextInt();
        }

        //declaration of difference arrray
        //This line creates a new array of integers with a length of n2. The array is initialized with default values of 0. This array will store the difference between the two input arrays.
        int diff[]=new int[n2];
        //declaration of carry
        int c=0;

        //declare variables i, j, and k to keep track of the indices of the a1, a2, and diff arrays, respectively.
        int i=a1.length-1;
        int j=a2.length-1;
        int k=diff.length-1;

        while (k >= 0) { //This line starts a while loop that continues as long as k is greater than or equal to 0.
            int a1val = i >= 0 ? a1[i] : 0; //This line uses the ternary operator to assign a value to a1val. If i is greater than or equal to 0, a1val is set to the i-th element of a1. Otherwise, a1val is set to 0.
            int d = a2[j] - a1val + c; //This line calculates the difference between the j-th element of a2 and a1val, adding the carry value c to the result.

            if (d < 0) {
                d += 10;
                c = -1;
            } else {
                c = 0;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }

        // print the result
        int idx = 0;
        while (idx < diff.length && diff[idx] == 0) {
            idx++;
        }

        while (idx < diff.length) {
            System.out.print(diff[idx] + " ");
            idx++;
        }
    }
}