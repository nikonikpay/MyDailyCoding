package opdracht.twenty;

import java.util.*;

public class exercise20 {


    public static void main(String[] args) {
        Set<Integer> myInput = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Give 5 Numbers");
        for (int i = 0; i < 5; i++) {
            int userinput = sc.nextInt();
            myInput.add(userinput);
        }

        myInput.forEach(System.out::println);
//        int sum = myInput.stream()
//                .mapToInt(number -> number)
//                .sum();
//        System.out.println(sum);
//
//        OptionalDouble optionalDouble = myInput.stream()
//                .mapToInt(number -> number)
//                .average();
//        if (optionalDouble.isPresent()) {
//            System.out.println(optionalDouble.getAsDouble());
//        }

    }

}
