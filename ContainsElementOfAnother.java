import java.util.ArrayList;
public class ContainsElementOfAnother {
    public static void main(String[]args){
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        ArrayList<Integer>al2=new ArrayList<>();
        al2.add(1);
        al2.add(2);
        al2.add(1);
        System.out.println(al1);
        System.out.println(al2);
       System.out.println( al1.containsAll(al2));
        

    }
}
