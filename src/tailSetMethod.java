import java.util.Iterator;
import java.util.TreeSet;
public class tailSetMethod {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Maths");
        ts.add("Science");
        ts.add("History");
        ts.add("English");
        ts.add("Literature");
        System.out.println(ts);
        //create the tailSet tree
        TreeSet<String> tailSet = new TreeSet<String>();
        tailSet = (TreeSet<String>) ts.tailSet("History");
        //create iterator
        Iterator i = tailSet.iterator();
        System.out.println("Tail Set Values :- ");
        //iterate through the sub set
        while (i.hasNext())  {
            System.out.print(i.next()+"  ");
        }
    }
}
