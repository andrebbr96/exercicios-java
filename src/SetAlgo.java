import java.util.HashSet;
import java.util.Set;

public class SetAlgo {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("a");
        stringSet.add("a");
        stringSet.add("b");
        stringSet.add("c");
        stringSet.add("c");
        stringSet.forEach(System.out::println);
        System.out.println(stringSet.contains("c"));
    }
}
