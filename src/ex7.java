import java.util.*;

/**
 * Created by borisgrunwald on 30/08/2016.
 */
public class ex7 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> listTwo = new LinkedList<>();

        Collections.addAll(list, 3,7,3,-1,2,3,7,2,15,15);
        Collections.addAll(listTwo, -5,15,2,-1,7,15,36);

        System.out.println(countCommon(list,listTwo));

    }

    public static int countCommon (List<Integer> listOne, List<Integer> listTwo) {

        Set<Integer> storage = new HashSet<>(listOne);

        storage.retainAll(listTwo);

        return storage.size();

    }
}
