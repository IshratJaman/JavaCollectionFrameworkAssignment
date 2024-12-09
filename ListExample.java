import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // ArrayList Example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList: " + list);

        // Sorted List using TreeSet
        SortedSet<String> sortedList = new TreeSet<>(list);
        System.out.println("SortedList: " + sortedList);
    }
}
