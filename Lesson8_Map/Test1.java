package Java_Advanced.Lesson8_Map;
//HashMap

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1241, "Pavlik");
        map1.put(5241, "Zaur");
        map1.put(1111, "Petr");
        map1.put(1112, "Maxim");
            map1.putIfAbsent(1111, "Zaur");
            System.out.println(map1.get(1111));

            map1.remove(1112);



        // System.out.println(map1);

        // System.out.println(map1.containsValue("Zaur"));
        // System.out.println(map1.containsKey(500));

        System.out.println(map1.keySet()); // mnozhestvo kluchej

        System.out.println(map1.values()); // znachenija

        
    }    
}
