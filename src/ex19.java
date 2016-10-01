import java.util.*;


/**
 * Created by borisgrunwald on 01/09/2016.
 */
public class ex19 {

    public static void main(String[] args) throws Exception {

        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        map.put("lol", 3);
        map.put("esfe", 4);
        map.put("ldrg", 3);
        map.put("drg", 4);
        map.put("fthf", 3);
        map.put("fsef",4);



        System.out.println(rarest(map));

    }

    public static int rarest (Map<String,Integer> map) throws Exception {

        if(map.size() == 0) {
            throw new Exception("Map is empty");
        }

        int[] count = new int [Collections.max(map.values())+1];

        for(int i : map.values()) {
            count[i]++;
        }

        int leastOccuring = Integer.MAX_VALUE;

        for(int i = 0; i <= count.length-1; i++ ) {
            if(count[i] < leastOccuring && count[i] != 0) {
                leastOccuring = i;
            }
        }

        return leastOccuring;
    }



}
