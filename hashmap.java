import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Adding key-value pairs to the HashMap
        map.put("apple", 20);
        map.put("india", 120);
        map.put("banana", 40);
        map.put("china", 150);

        // Displaying the HashMap
        System.out.println(map);

        for(Map.Entry<String, Integer > e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key +" " + map.get(key));
        }
    }
}