import java.util.*;

/**
 * Created by borisgrunwald on 28/08/2016.
 */
public class ex2 {

    public static void main(String[] args) {



        List<Integer> listOne = new LinkedList<>();
        List<Integer> listTwo = new LinkedList<>();

        Collections.addAll(listOne, 1,2,3,4,5,6);
        Collections.addAll(listTwo, 7,8,9,10,11,12);

        System.out.println(alternate(listOne,listTwo));



    }

    public static ArrayList<Integer> alternate (List<Integer> listOne, List<Integer> listTwo) {

        ArrayList<Integer> toReturn = new ArrayList<>();

        Iterator<Integer> itOne = listOne.iterator();
        Iterator<Integer> itTwo = listTwo.iterator();

        while(listOne.size() > listTwo.size() ? itOne.hasNext() : itTwo.hasNext()) {

            if(itOne.hasNext()) {
               toReturn.add(itOne.next());
            }
            if(itTwo.hasNext()) {
                toReturn.add(itTwo.next());
            }

        }

        return toReturn;

    }

}
