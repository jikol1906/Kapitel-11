import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * Created by borisgrunwald on 31/08/2016.
 */
public class ex14 {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();

        map1.put("Janet",87);
        map1.put("Logan",62);
        map1.put("Whitaker",46);
        map1.put("Alyssa",100);
        map1.put("Stefanie",80);
        map1.put("Jeff",88);
        map1.put("Kim",52);
        map1.put("Sylvia",95);

        Map<String, Integer> map2 = new HashMap<>();

        map2.put("Logan",62);
        map2.put("Kim",52);
        map2.put("Whitaker",52);
        map2.put("Jeff",88);
        map2.put("Stefanie",80);
        map2.put("Brian",60);
        map2.put("Lisa",83);
        map2.put("Sylvia",87);

        System.out.println(intersect(map1,map2));


    }

    public static HashMap<String, Integer> intersect(Map<String,Integer> map1,Map<String,Integer> map2) {

        HashMap<String,Integer> toReturn = new HashMap<>();

        Set<String> commonNames = new HashSet<>(map1.keySet());
        commonNames.retainAll(map2.keySet());

        for(String s : commonNames) {
            if(map1.get(s) == map2.get(s)) {
                toReturn.put(s,map1.get(s));
            }
        }

        return toReturn;


    }

}
