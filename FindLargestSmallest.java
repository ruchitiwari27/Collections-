import java.util.ArrayList;
import java.util.Collections;

public class FindLargestSmallest {
    public static void main(String[]args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));
       // System.out.println(Collections.min(al));

    }
}
