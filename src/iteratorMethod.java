import java.util.Iterator;
import java.util.TreeSet;
public class iteratorMethod {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Maths");
        ts.add("Science");
        ts.add("History");
        ts.add("English");
        ts.add("Literature");
        System.out.println("TreeSet is :- "+ts);
        //create an iterator
        Iterator i = ts.iterator();
        System.out.println("Iterator Values: ");
        while (i.hasNext())  {
            System.out.println("  "+"*"+" "+i.next());
        }
    }
}
