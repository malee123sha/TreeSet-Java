import java.util.TreeSet;
public class removeElements {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        //add elements
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        System.out.println("Before Removing :- "+ts);
        ts.remove("B");
        System.out.println("After Removing  :- "+ts);
        System.out.println("............................................");
        //remove first element
        ts.pollFirst();
        System.out.println("After Removing First Element :- "+ts);
        //remove last element
        ts.pollLast();
        System.out.println("After Removing Last Element  :- "+ts);
    }
}
