import java.util.*;

/**
 * Created by borisgrunwald on 29/08/2016.
 */
public class ex5 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list, 7,4,-9,4,15,8,27,7,11,-5,32,-9,-9);

        System.out.println(sortAndRemoveDuplicates(list));



    }

    public static Set<Integer> sortAndRemoveDuplicates (List<Integer> list) {

        Collections.sort(list);
        return new TreeSet<>(list);
    }

}
