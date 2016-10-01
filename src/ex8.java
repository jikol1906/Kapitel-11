import java.util.*;

/**
 * Created by borisgrunwald on 30/08/2016.
 */
public class ex8 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "lol", "loll", "lolll", "lollll", "he");

        System.out.println(minLength(list));

    }

    public static int minLength (Collection<String> list) {

        return new TreeSet<String>(list).first().length();

    }

}
