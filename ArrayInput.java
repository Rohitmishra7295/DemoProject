import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        //initilization of an array of n size
        int[] Array= new int[n];

        //print array
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+ i +" ith element");
            Array[i] =sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(Array[i]);
        }     
    }

}
