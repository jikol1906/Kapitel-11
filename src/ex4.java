import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by borisgrunwald on 29/08/2016.
 */
public class ex4 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list, 15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9);

        partition(list, 5);

        System.out.println(list);


    }

    public static void partition (LinkedList<Integer> list, int e) {

        LinkedList<Integer> finalList = new LinkedList<>();

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            int number = it.next();
            it.remove();
            if(number <= e) {
                finalList.addFirst(number);
            } else {
                finalList.addLast(number);
            }

        }

        list.addAll(finalList);

    }

}
