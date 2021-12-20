package opdracht.nineteen.two;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class excercise2 {

    public static void main(String[] args) {
        int[] intArray = new int[]{2, 3, 4, 58, 98, 76, 89};

        int someIntArray = IntStream.of(intArray)
                .reduce(0,(acc,e)->acc+(e*e));

        System.out.println(someIntArray);


        String[] strArray = new String[]{"This","is", "a","String","array"};
        String sepreated = Stream.of(strArray)
                .reduce("",(acc,e)-> acc+";"+e);
        sepreated = sepreated.substring(1);
        System.out.println(sepreated);




         



    }
}
