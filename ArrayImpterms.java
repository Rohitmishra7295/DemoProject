public class ArrayImpterms {
    public static void main(String[] args) {
        int[] arr= new int[6];

        arr[0]=9;
        System.out.println(arr[0]);
        arr[1]=arr[0]+3*2;
        System.out.println(arr[1]);
        arr[2]=arr[1]++;
        System.out.println(arr[2]);
        arr[3]-=60;
        System.out.println(arr[3]);
    }
}
