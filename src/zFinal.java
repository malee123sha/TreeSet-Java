import java.util.Iterator;
import java.util.TreeSet;
public class zFinal {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        //checks if the Tree Set is empty or not
        System.out.println("Is the TreeSet Empty ? :- "+ts.isEmpty());
        //checks  size of the TreeSet
        System.out.println("TreeSet Size is :-"+ts.size());
        //add elements
        ts.add("Third Generation");
        ts.add("Fifth Generation");
        ts.add("Second Generation");
        ts.add("First Generation");
        ts.add("Fourth Generation");
        System.out.println(ts);
        System.out.println("............................................................................................");
        //first element
        System.out.println("First Element is :- "+ts.first());
        //last element
        System.out.println("Last Element is  :- "+ts.last());
        System.out.println("............................................................................................");
        System.out.println("Before Removing  :-"+ts);
        //remove elements
        ts.remove("Third Generation");
        System.out.println("After Removing   :-"+ts);
        System.out.println("............................................................................................");
        //remove last lowest element
        System.out.println("Last lowest element is  :- "+ts.pollLast());
        System.out.println("After using pollLast Method  :- "+ts);
        System.out.println("............................................................................................");//remove first lowest element
        System.out.println("First lowest element is :- "+ts.pollFirst());
        System.out.println("After using pollFirst Method :- "+ts);
        System.out.println("............................................................................................");
        //check "First Generation" available
        String check1 = "First Generation";
        System.out.println("Contains :- "+check1+"   "+ts.contains(check1));
        //check "BMW" available
        String check2 = "BMW";
        System.out.println("Contains :- "+check2+"   "+ts.contains(check2));
        System.out.println("............................................................................................");
        //create an iterator
        Iterator i = ts.iterator();
        System.out.println("Iterator Values: ");
        while (i.hasNext())  {
            System.out.println("  "+"*"+" "+i.next());
        }
        System.out.println("............................................................................................");
        //use clear method
        ts.clear();
        System.out.println("After Using Clear Method  :- "+ts);
    }
}
