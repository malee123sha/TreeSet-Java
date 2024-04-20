import java.util.TreeSet;
public class isEmpty{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        System.out.println(ts);
        //checks if the Tree Set is empty or not
        System.out.println("Is the TreeSet Empty ? :- "+ts.isEmpty());
        System.out.println("............................................................................................");
        ts.add("Mazda");
        ts.add("Alto");
        ts.add("Hybrid");
        ts.add("BMW");
        System.out.println("Tree Set :- "+ts);
        //checks if the Tree Set is empty or not
        System.out.println("Is the TreeSet Empty ? :- "+ts.isEmpty());
        System.out.println("............................................................................................");
        //use clear method
        ts.clear();
        System.out.println("Tree Set :- "+ts);
        //checks if the Tree Set is empty or not
        System.out.println("Is the TreeSet Empty ? :- "+ts.isEmpty());
    }
}
















