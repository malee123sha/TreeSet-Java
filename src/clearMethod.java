import java.util.TreeSet;
public class clearMethod {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Mazda");
        ts.add("Alto");
        ts.add("Hybrid");
        ts.add("BMW");
        System.out.println("Before Using Clear Method :- "+ts);
        //use clear method
        ts.clear();
        System.out.println("After Using Clear Method  :- "+ts);
    }
}
