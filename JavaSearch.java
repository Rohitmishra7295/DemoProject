public class JavaSearch {
    public static void main(String[] args) {
        int array[]={2,1,4,6,5};
        int key=9 ;

        int res=-1;
        System.out.println(array.length);
        //search for key
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                res=i;
                break;
            }
        }
        
        if(res==-1){
            System.out.println("not found");
        }else{
            System.out.println("found at location "+res);
        }
    }
}



