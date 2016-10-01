import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by borisgrunwald on 01/09/2016.
 */
public class ex18 {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("42", "Marty");
        map.put("81", "Sue");
        map.put("17", "Ed");
        map.put("31", "Dave");
        map.put("56", "Ed");
        map.put("3", "Marty");
        map.put("29", "Ed");

        System.out.println(reverse(map));

    }

    public static Map<String, Set<String>> reverse (Map<String,String> map) {

        Map<String,Set<String>> toReturn = new HashMap<>();
        Set<String> names = new HashSet<>(map.values());

        for(String name : names) {
            Set<String> toAdd = new HashSet<>();
            for(String number : map.keySet()) {
                if(map.get(number).equals(name)) {
                    toAdd.add(number);
                }
            }
            toReturn.put(name,toAdd);
        }

        return toReturn;

    }

}
