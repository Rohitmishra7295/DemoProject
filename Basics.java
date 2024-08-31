public class Basics {
    public static void main(String[] args) {
        int Array[]=new int[6];

        Array[0]=20;
        Array[1]=201;
        Array[2]=2011;
        Array[3]=20111;
        Array[4]=201111;
        Array[5]=20111111;
       
        for (int i : Array) {
            System.out.println(i);
        }
    System.out.println(Array.length);
    System.out.println(Array.toString());
    }
}
