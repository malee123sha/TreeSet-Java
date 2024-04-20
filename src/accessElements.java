import java.util.TreeSet;
public class accessElements {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        //add elements
        ts.add("Mazda");
        ts.add("BMW");
        ts.add("Hybrid");
        System.out.println("Tree Set :-"+ts);
        //check "BMW" available
        String check = "BMW";
        System.out.println("Contains :- "+check+"   "+ts.contains(check));
        System.out.println("............................................................................................");
        //First Element
        System.out.println("First Element :- "+ts.first());
        //Last Element
        System.out.println("Last Element  :- "+ts.last());
        System.out.println("............................................................................................");
        //higher & lower value
        System.out.println("Access Higher Value :- "+ts.higher("Hybrid"));
        System.out.println("Access Lower Value  :- "+ts.lower("Mazda"));
    }
}
