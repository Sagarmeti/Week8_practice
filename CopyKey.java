import java.util.HashMap;
import java.util.Map;

public class CopyKey {
    public static void main(String[] args) {
  
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 1);
        map1.put("banana", 2);
        map1.put("orange", 3);
        System.out.println("Map1 elements-->"+map1);

        Map<String, Integer> map2 = new HashMap<>();
      
        map2.putAll(map1);

        System.out.println("copied Map2 elements from map1--> " + map2);
    }
}
