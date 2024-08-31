import java.util.Scanner;
public class BasicOfArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //to get size of array
        int n=sc.nextInt();

        //initialization of array
        int[] arr= new int[n];
       
        //traversing array
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+"th index");
            arr[i]=sc.nextInt();
            
        }
       //printing array elements
       for(int i=0;i<n;i++){
        System.out.println(arr[i]);
       }
        

    }
}
