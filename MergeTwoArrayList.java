import java.util.ArrayList;
public class MergeTwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> al1=new ArrayList<>();
        al1.add("r");
        al1.add("u");
        al1.add("c");
        ArrayList<String> al2=new ArrayList<>();
        al2.add("h");
        al2.add("i");
        al1.addAll(al2);//this method isused to merge ttwo lists
        System.out.println(" merged list"+al1);
    }
    
}
