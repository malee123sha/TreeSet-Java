import java.util.Iterator;
import java.util.TreeSet;
public class iterateTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(100);
        t.add(300);
        t.add(500);
        t.add(700);
        t.add(200);
        t.add(600);
        t.add(400);
        //using iterator
        System.out.println("Using Iterator");
        Iterator i = t.iterator();
        while (i.hasNext())
            System.out.print(i.next()+"  ");
        System.out.println();System.out.println("............................................");
        System.out.println("Using For Loop");
            //iterate through for loop
        for (int val : t)
            System.out.print(val+"  ");
    }
}
