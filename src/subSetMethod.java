import java.util.Iterator;
import java.util.TreeSet;
public class subSetMethod {
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
        TreeSet<Integer> subSet = new TreeSet<Integer>();
        subSet = (TreeSet<Integer>) t.subSet(10,500);
        //create iterator
        Iterator i = subSet.iterator();
        System.out.println("Sub Set Values :- ");
        //iterate through the sub set
        while (i.hasNext())  {
            System.out.print(i.next()+"  ");
        }
    }
}
