/*
 *1.you are given a num n,representing the count of elements.
 * 2.you are given n numbers
 * you are required to find the span of input.span is defined as
 * diff of max value and min value
 * 
 * constraints 1<=n <=10^4
 * 0<=n1,n2...n elements <=10^9
 */

 import java.util.Scanner;
public class ArraySpan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER VALUE OF n");
        int n=sc.nextInt();

        System.out.println("Enter elements");
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr [i]<min){
                min=arr[i];
            }
        }
        int span=max-min;
        System.out.println(span);
        sc.close();
    }
}
