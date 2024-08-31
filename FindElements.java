/*1.you are given a number n,representing the size of array a
* 2.you are given n numbers ,representing elements of array a.
* 3.you are given another number d
* 4.you are required to check d number exist in array a and at what index
if found print the index else print -1


CONSTRAINTS
1<=n<=10^7
-10^9<=n1,n2,... n elements <=10^9
-10^9<=d<=10^9
 */

import java.util.Scanner;
public class FindElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+"th index");
            arr[i]=sc.nextInt();
        }

        //data to be find
        System.out.println("enter element to find form array");
        int data=sc.nextInt();

        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                index=i;
                break;
            }
        }

        System.out.println(index);
    }
}
