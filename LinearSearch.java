import java.util.Scanner;
public class LinearSearch {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    //input the number of elements
    System.out.println("Enter the number of elements");
    int n=sc.nextInt();
    int arr[]=new int[n];
    

    for(int i=0;i<n;i++){
        System.out.println("Enter elements at "+i +"th index");
        arr[i]=sc.nextInt();
    }

     // Input the value to search for
     System.out.print("Enter the value to search for: ");
     int valueToSearch = sc.nextInt();

    boolean found=false;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==valueToSearch){
            System.out.println("Value " + valueToSearch + " found at index " + i + ".");
                found = true;
                break;  //
        }
    }
    if (!found) {
        System.out.println("Value " + valueToSearch + " not found in the array.");
    }
}
}
