import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by borisgrunwald on 30/08/2016.
 */
public class ex6 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list, 3, 7, 3, -1, 2, 3, 7, 2, 15, 15);

        System.out.println(countUnique(list));
    }

    public static int countUnique (List<Integer> list) {

        return new HashSet<Integer>(list).size();

    }


}
