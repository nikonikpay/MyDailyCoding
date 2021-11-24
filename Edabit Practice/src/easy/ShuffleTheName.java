package easy;
/*
Create a method that accepts a string (of a person's first and last name) and returns a string with the first and last name swapped.

Examples
nameShuffle("Donald Trump") ➞ "Trump Donald"

nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"

nameShuffle("Seymour Butts") ➞ "Butts Seymour"
 */


import java.util.List;

public class ShuffleTheName {

    public static void main(String[] args) {

        System.out.println(shuffle("Ali nikpey"));

    }

    public static String shuffle(String name){
        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ") + 1); // + 1 to skip the space
        String cName =  lastName + " " + firstName;  //Add a comma and space
        return cName;

    }


    //second way
    public static String nameShuffle(String s) {
        int flag =0;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)!= ' '){
                sb.append(s.charAt(i));
            }else{
                sb.insert(0, s.charAt(i));
                flag = i;
                break;
            }
        }
        int f = 0;
        for(int i=flag+1; i<s.length(); i++){
            sb.insert(f, s.charAt(i));
            f++;
        }
        return sb.toString();
    }

    //third way
    public static String name2Shuffle(String s) {
        return s.split("\\s")[1] + " " + s.split("\\s")[0];
    }

}
