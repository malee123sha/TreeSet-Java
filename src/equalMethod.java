import java.util.TreeSet;
public class equalMethod {
    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        TreeSet<String> ts3 = new TreeSet<>();
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
        ts3.add("Mazda");
        ts3.add("Alto");
        ts3.add("Hybrid");
        ts3.add("BMW");
        System.out.println("TreeSet 1 :- "+ts1);
        System.out.println("TreeSet 2 :- "+ts2);
        //compare TreeSet 1 to TreeSet 2
        boolean val1 = ts1.equals(ts2);
        System.out.println("Are both set equal :- "+val1);
        System.out.println(".................................................");
        System.out.println("TreeSet 1 :- "+ts1);
        System.out.println("TreeSet 3 :- "+ts3);
        //compare TreeSet 2 to TreeSet 3
        boolean val2 = ts1.equals(ts3);
        System.out.println("Are both set equal :- "+val2);
    }
}
