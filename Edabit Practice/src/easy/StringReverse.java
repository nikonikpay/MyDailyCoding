package easy;

public class StringReverse {
    public static void main(String[] args) {

        System.out.println(stringReverse("Hello World"));;

    }

    public static String stringReverse(String myString){

        StringBuilder str = new StringBuilder(myString);

        return  str.reverse().toString();
    }

    // second way
    public static String reverse(final String str) {
        String reverse = "";
        for(int i= str.length()-1;i>= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }


}
