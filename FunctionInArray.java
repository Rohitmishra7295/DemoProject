import java.util.Scanner;
public class FunctionInArray {

    //function to print array


     public static void printArray (int[] arr){
        int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}
    //function to take input


    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("ENTER ELEMENT AT "+i+"th POSITION");
            arr[i]=sc.nextInt();
        }
        return arr;
     }

public static void main(String args[]){
  int arr[]=takeInput();
  printArray(arr);

}

}
