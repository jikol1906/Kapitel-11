import java.util.*;

/**
 * Created by borisgrunwald on 01/09/2016.
 */
public class ex16 {

    public static void main(String[] args) {

        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();

        map1.put("Marty", "206-9024");
        map1.put("Hawking", "123-4567");
        map1.put("Smith", "949-0504");
        map1.put("Newton", "123-4567");

        map2.put("Marty", "206-9024");
        map2.put("Hawking", "123-4567");
        map2.put("Smith", "949-0504");
        map2.put("Newton", "432-46345");

        System.out.println(is1to1(map2));

    }

    public static boolean is1to1 (Map<String,String> map) {

        List<String> values = new LinkedList<>(map.values());
        Set<String> noDuplicates = new HashSet<>(map.values());
        return values.size() == noDuplicates.size();

    }

}
