import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
         int size=sc.nextInt(); //to taking input from user
         int  array []=new int[size]; //initialization of array

         System.out.println("enter the elements");
         for(int i=0;i<size;i++){ //to store elements in array
            array[i]=sc.nextInt();
         }
         sc.close();
         System.out.println("printing elements of an array");
         for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
         }
    }
}
