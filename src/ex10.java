import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by borisgrunwald on 31/08/2016.
 */
public class ex10 {
    public static void main(String[] args) {

        Set<String> words = new HashSet<>();

        Collections.addAll(words, "this", "list", "contains", "some", "odd", "words");

        removeOddLength(words);

        System.out.println(words);


    }

    public static void removeOddLength (Set<String> words) {

        Iterator<String> it = words.iterator();

        while (it.hasNext()) {
            String word = it.next();
            if(word.length() % 2 != 0) {
                it.remove();
            }
        }

    }
}
