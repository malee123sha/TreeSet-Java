import java.util.TreeSet;
public class Duplicate {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        //add elements
        ts.add("Mazda");
        ts.add("BMW");
        ts.add("Hybrid");
        //duplicate
        ts.add("BMW");
        System.out.println(ts);
    }
}
