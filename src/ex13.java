import java.util.*;

/**
 * Created by borisgrunwald on 31/08/2016.
 */
public class ex13 {

    public static void main(String[] args) {

        Map<String,String> names = new HashMap<>();

        names.put("Marty", "Stepp");
        names.put("Stuart", "Reges");
        names.put("Jessica", "Miller");
        names.put("Amanda", "Camp");
        names.put("Hal", "Perkins");


        Map<String,String> names2 = new HashMap<>();

        names2.put("Marty", "Stepp");
        names2.put("Stuart", "Reges");
        names2.put("Jessica", "Miller");
        names2.put("Amanda", "Camp");
        names2.put("Hal", "Reges");

        System.out.println(isUnique(names2));




    }

    public static boolean isUnique (Map<String, String> m) {

        List<String> surnames = new ArrayList<>(m.values());
        Set<String> noDuplicates = new HashSet<>(surnames);
        return surnames.size() == noDuplicates.size();

    }

}
