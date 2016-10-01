import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by borisgrunwald on 31/08/2016.
 */
public class ex11 {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        Set<Integer> numbers2 = new HashSet<>();

        Collections.addAll(numbers, 1,4,7,9);
        Collections.addAll(numbers2, 2,4,5,6,7);

        System.out.println(symmetricSetDifference(numbers,numbers2));

    }

    public static Set<Integer> symmetricSetDifference (Set<Integer> numbers1, Set<Integer> numbers2) {

        Set<Integer> toReturn = new HashSet<>();

        Set<Integer> difference = new HashSet<>(numbers1);
        difference.removeAll(numbers2);
        Set<Integer> difference2 = new HashSet<>(numbers2);
        difference2.removeAll(numbers1);

        toReturn.addAll(difference);
        toReturn.addAll(difference2);

        return toReturn;

    }

}
