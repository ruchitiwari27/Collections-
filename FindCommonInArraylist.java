import java.util.ArrayList;

public class FindCommonInArraylist {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(7);
        al1.add(8);
        System.out.println(al1);

        al.retainAll(al1);
        System.out.println("Common elements: "
                           + al); 
    }
    
}

        
