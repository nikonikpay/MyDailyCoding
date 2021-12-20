package opdracht.nineteen.four;

import opdracht.nineteen.Person;

import java.util.*;

import static opdracht.nineteen.Person.Gender.FEMALE;

public class Exercise4 {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();

        person.add(new Person("Ali","Nikpey", Person.Gender.MALE,34,84,179));
        person.add(new Person("Marouane","Azouzat", Person.Gender.MALE,30,90,185));
        person.add(new Person("Emrah","Yavuz", Person.Gender.MALE,31,79,175));
        person.add(new Person("Mustafa","Bugra", Person.Gender.MALE,28,79,176));
        person.add(new Person("Zuhur","Ahmed", FEMALE,29,60,180));
        person.add(new Person("Jan","Blomaert", Person.Gender.MALE,55,65,185));
        person.add(new Person("Uneys","Asik", Person.Gender.MALE,31,75,178));
        person.add(new Person("Ozgur","Polat", Person.Gender.MALE,44,86,183));
        person.add(new Person("Najmus","Sahar", FEMALE,27,55,173));
        person.add(new Person("Nazif","Altinas", Person.Gender.MALE,29,65,180));
        person.add(new Person("Erik","Holanders", Person.Gender.MALE,34,84,179));
        person.add(new Person("Loik","Deketelaere", Person.Gender.MALE,21,60,175));

        System.out.println("Female people");
        person.stream()
                .filter(e-> e.getGender()== FEMALE)
                .forEach(System.out::println);

        System.out.println("================================================");
        System.out.println("People More than 34 year old");
        person.stream()
                .filter(e-> e.getAge()>34)
                .forEach(System.out::println);


        System.out.println("================================================");
        System.out.println("People who weight more than 60 and less than 90");
        person.stream()
                .filter(e-> e.getWeight()>60)
                .filter(e-> e.getWeight()<80)
                .forEach(System.out::println);

        System.out.println("================================================");
        System.out.println("People who are older than 30 and weight less than 75");
        person.stream()
                .filter(e-> e.getAge() > 30)
                .filter(e-> e.getWeight()<=75)
                .forEach(System.out::println);

        System.out.println("================================================");
        System.out.println("People Ages");
        person.stream()
                .forEach(e-> System.out.println(e.getAge()));


        System.out.println("================================================");
        System.out.println("First Name and last Name");
        person.stream()
                .map(e-> e.getFirstName()+" "+ e.getLastName())
                .forEach(System.out::println);

        System.out.println("================================================");
        System.out.println("Older one");
        Optional maxAge = person.stream()
                .max(Comparator.comparing(Person::getAge));
        if (maxAge.isPresent())
            System.out.println(maxAge.get());
        else
            System.out.println("-1");

        System.out.println("================================================");
        System.out.println("Average Age");
        OptionalDouble averageAge =  person.stream()
                 .mapToInt(Person::getAge)
                 .average();

        if (averageAge.isPresent())
            System.out.println(averageAge.getAsDouble());
        else
            System.out.println("-1");

        System.out.println("================================================");
        System.out.println("People Weight");
        person.stream()
                .forEach(e-> System.out.println(e.getWeight()));














    }


}
