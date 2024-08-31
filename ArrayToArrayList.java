import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ArrayToArrayList {
    public static void main(String[] args) {
         String [] colors={"Red","Green","Blue"};
        List list=Arrays.asList(colors); // Method-1 to create list by Arrays.asList
        System.out.println(list);

        List <String> l=new ArrayList<>();
        Collections.addAll(l, colors);// Method-2 to create list by Collections.addALL
        System.out.println(l);  

        for(String strings:colors){ 
            l.add(strings); //Method-3 to create list
        }
        System.out.println(l);
    }
}
