import java.util.TreeSet;
public class sizeMethod {
    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        TreeSet<Double> ts3 = new TreeSet<>();
        ts1.add("Mazda");
        ts1.add("Alto");
        ts1.add("Hybrid");
        ts1.add("BMW");
        ts2.add(2000);
        ts2.add(5000);
        ts2.add(1000);
        ts2.add(6000);
        ts2.add(4000);
        ts2.add(3000);
        ts3.add(0.5);
        ts3.add(2.66);
        ts3.add(820.66);
        System.out.println("TreeSet 1 :- "+ts1);
        System.out.println("TreeSet 1 Size is :-"+ts1.size());
        System.out.println("..................................................");
        System.out.println("TreeSet 2 :- "+ts2);
        System.out.println("TreeSet 2 Size is :-"+ts2.size());
        System.out.println("..................................................");
        System.out.println("TreeSet 3 :- "+ts3);
        System.out.println("TreeSet 3 Size is :-"+ts3.size());
    }
}
