import java.util.HashMap;
import java.util.Map;

/**
 * Created by borisgrunwald on 01/09/2016.
 */
public class ex17 {

    public static void main(String[] args) {

        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();

        map1.put("Marty", "206-9024");
        map1.put("Smith", "949-0504");


        map2.put("Marty", "206-9024");
        map2.put("Hawking", "123-4567");
        map2.put("Smith", "949-0504");
        map2.put("Newton", "432-46345");

        System.out.println(submap(map1,map2));

    }

    public static boolean submap(Map<String,String> map1, Map<String,String> map2) {

        for(String s : map1.keySet()) {
            if(!map2.containsKey(s) && !map2.containsValue(map1.get(s))) {
                return false;
            }
        }

        return true;

    }

}
