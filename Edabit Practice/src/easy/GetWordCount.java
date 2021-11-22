package easy;

/*
Get Word Count
Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6

countWords("This is a test") ➞ 4

countWords("What an easy task, right") ➞ 5
 */

import java.util.StringTokenizer;

public class GetWordCount {
    public static void main(String[] args) {
        System.out.println(getWordCount("my name is ali nikpey from iran"));
        System.out.println(countWordsUsingStringTokenizer("my name is     ali nikpey from iran"));
        System.out.println(count("my name is     ali nikpey3   from iran"));
    }

    // first way - using split
    public static int getWordCount(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");

        return words.length;
    }

    // Second way - using tokenize
    public static int countWordsUsingStringTokenizer(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(sentence);
        return tokens.countTokens();
    }

    // third way - manual without using library

    public static int count(String sentence) {

        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = sentence.length() - 1;
        char[] characters = sentence.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i]) && i != endOfLine) {

                isWord = true;
            }
            // if char isn't a letter and there have been letters before, // counter goes up.
            else if(!Character.isLetter(characters[i]) && isWord){
                wordCount++;
                isWord =false;

            }
            // last word of String; if it doesn't end with a non letter, it // wouldn't count without this.

           else if (Character.isLetter(characters[i]) && i == endOfLine){
               wordCount++;
            }
        }
        return wordCount;

    }


}
