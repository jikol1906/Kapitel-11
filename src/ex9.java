import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by borisgrunwald on 31/08/2016.
 */
public class ex9 {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        Set<Integer> numbers2 = new HashSet<>();

        Collections.addAll(numbers, 3,5,7,9,11,13);
        Collections.addAll(numbers2, 3,5,7,9,11,13,14);

        System.out.println(hasEven(numbers));
        System.out.println(hasEven(numbers2));

    }

    public static boolean hasEven (Set<Integer> numbers) {

        for(int i : numbers) {
            if(i % 2 == 0) {
                return true;
            }
        }

        return false;

    }

}
