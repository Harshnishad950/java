import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);

        if(set.contains(20)) {
            System.out.println("Set contains 20");
        } else {
            System.out.println("Set does not contain 20");
        }

        set.remove(30);
        System.out.println("Set after removing 30: " + set);

        
        System.out.println("Size of the set: " + set.size());

        // iterator in HashSet
        Iterator<Integer> iterator = set.iterator();
   }                                      
}
