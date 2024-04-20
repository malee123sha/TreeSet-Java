import java.util.TreeSet;
public class pollLast {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        System.out.println("Using pollLast Method when TreeSet is empty :- " + ts.pollFirst());
        ts.add("Mazda");
        ts.add("BMW");
        ts.add("Hybrid");
        ts2.add(2000);
        ts2.add(5000);
        ts2.add(1000);
        ts2.add(6000);
        ts2.add(4000);
        ts2.add(3000);
        System.out.println("TreeSet 01 :- ");
        System.out.println("Before using pollLast Method :- "+ts);
        System.out.println("Last lowest element is:- "+ts.pollLast());
        System.out.println("After using pollLast Method  :- "+ts);
        System.out.println("....................................................................");
        System.out.println("TreeSet 02 :- ");
        System.out.println("Before using pollLast Method :- "+ts2);
        System.out.println("Last lowest element is:- "+ts2.pollLast());
        System.out.println("After using pollLast Method  :- "+ts2);
    }
}
