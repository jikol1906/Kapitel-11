import java.util.*;

/**
 * Created by borisgrunwald on 31/08/2016.
 */
public class ex12 {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        Collections.addAll(list, "String", "Word", "lol", "wut", "hehe", "nice", "lol", "lol");

        System.out.println(contains3(list));

    }

    public static boolean contains3 (List<String> list) {

        Map<String,Integer> storage = new HashMap<>();

        for(String s : list) {
            if(storage.containsKey(s)) {
                int count = storage.get(s);
                storage.put(s,count+1);
            } else {
                storage.put(s, 1);
            }
        }

        for(int i : storage.values()) {
            if(i >= 3) {
                return true;
            }
        }

        return false;

    }

}
