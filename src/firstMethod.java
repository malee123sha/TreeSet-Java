import java.util.TreeSet;
public class firstMethod {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        ts.add("Mazda");
        ts.add("BMW");
        ts.add("Hybrid");
        ts2.add(2000);
        ts2.add(5000);
        ts2.add(1000);
        ts2.add(6000);
        ts2.add(3000);
        System.out.println("TreeSet 01 :- "+ts);
        System.out.println("First Element is :- "+ts.first());
        System.out.println("....................................................................");
        System.out.println("TreeSet 02 :- "+ts2);
        System.out.println("First Element is :- "+ts2.first());
    }
}
