import java.util.TreeSet;
public class pollFirst {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        System.out.println("Using pollFirst Method when TreeSet is empty :- "+ts.pollFirst());
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
        System.out.println("Before using pollFirst Method :- "+ts);
        System.out.println("First lowest element is:- "+ts.pollFirst());
        System.out.println("After using pollFirst Method  :- "+ts);
        System.out.println(".....................................................................");
        System.out.println("TreeSet 02 :- ");
        System.out.println("Before using pollFirst Method :- "+ts2);
        System.out.println("First lowest element is:- "+ts2.pollFirst());
        System.out.println("After using pollFirst Method  :- "+ts2);
    }
}
