import java.util.*;

/**
 * Created by borisgrunwald on 01/09/2016.
 */
public class ex15 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3,1,5,3,6,7,8,3,4,3));

        System.out.println(maxOccurences(numbers));

    }

    public static int maxOccurences (List<Integer> list) {

        if(list.size() == 0) {
            return 0;
        }

        Map<Integer,Integer> storage = new HashMap<>();

        for(int i : list) {
            if(storage.containsKey(i)) {
                int count = storage.get(i);
                storage.put(i, count+1);
            } else {
                storage.put(i,1);
            }
        }

        return new TreeSet<Integer>(storage.values()).last();

    }

}
