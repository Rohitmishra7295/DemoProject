public class Array {
    public static void main(String[] args) {
        //Different types of declaration of array
        int A[]=new int[10]; //type 1
        int B[]={1,2,3,4,5,6}; //type 2
        int C[]; //type 3
        C=new int[10];
        int [] D=new int[5]; //type 4
        //to change value of any index by using reference of subscript
        B[2]=15;

        //Display Array or for printing array element we have to use for loop
        for(int i=0;i<B.length;i++){ //use arrayname.length to access all the elements of any array
            System.out.println("This is classic for loop to print Arrays"+B[i]);
        }
        System.out.println(B.length);

        for (int str: B) {
            System.out.println("Enhanced for loop to print Arrays"+ str);
        }

        // int Arr[]=new int[10];
        // Arr[0]=5;
        // Arr[1]=10;
        // Arr[2]=15;
        // Arr[3]=20;
        // Arr[4]=25;
        int Arr []={5,10,15,20,25};
        System.out.println(Arr[2]);
        System.out.println(Arr[3]);
        System.out.println(Arr[4]);

        //Declaration of character array
        char[] cArray=new char[10];
        //Declaration of double array
        double[] darray=new double[10];
        System.out.println(cArray[1]);
        System.out.println(darray[1]);
    }
}
