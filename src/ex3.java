import java.util.*;


/**
 * Created by borisgrunwald on 28/08/2016.
 */
public class ex3 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list, 1, 1, 2, 0, 4, 5, 6, 8, 8, 3, 11, 9, 12, 0, 14, 0, 16);

        removeEvenInRange(list, 5, 13);

        System.out.println(list);



    }

    public static void removeEvenInRange(LinkedList<Integer> list, int startIndex, int endIndex) {

        Iterator<Integer> it = list.iterator();

        int count = 0;

        while(it.hasNext()) {
            if(count >= startIndex && count < endIndex) {
                int number = it.next();
                if(number % 2 == 0) {
                    it.remove();
                }

            } else {
                it.next();
            }

            count++;
        }
    }

}
