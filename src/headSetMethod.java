import java.util.Iterator;
import java.util.TreeSet;
public class headSetMethod {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(566);
        t.add(100);
        t.add(7);
        t.add(20);
        t.add(50);
        t.add(4);
        t.add(66);
        t.add(4000);
        t.add(520);
        System.out.println(t);
        //create the subset tree
        TreeSet<Integer> headSet = new TreeSet<Integer>();
        headSet = (TreeSet<Integer>) t.headSet(600);
        //create iterator
        Iterator i = headSet.iterator();
        System.out.println("Head Set Values :- ");
        //iterate through the sub set
        while (i.hasNext())  {
            System.out.print(i.next()+"  ");
        }
    }
}
