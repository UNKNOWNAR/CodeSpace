/*14.	Write a program to accept a sentence that may be terminated by either ‘.’, ‘?’ or ‘!’. The words are to be separated by a single blank space and are in uppercase.

Perform the following tasks:-
a.	Check the validity of the accepted sentence only for the terminating character.
b.	Arrange the words in ascending order of the lengths. If two or more words’ lengths are the same, sort them alphabetically.
c.	Display the original sentence along with the converted sentence.

[Condition:- No words in length should be more than 15 characters.]*/
import java.util.*;
public class SentenceProcessor
{
    int length = 0;
    String[] wordSplitter(String word[], String inputSentence)
    {
        String nword = "";
        int counter = 0;
        for(int i=0;i<length;i++)
        {
            char ch = inputSentence.charAt(i);
            if(ch==' ') {
                word[counter] = nword;
                counter++;
                nword = "";
            }
            else if (ch != '.' && ch != '?' && ch != '!')
                nword += ch;
        }
        return word;
    }
    int wordCounter(String inputSentence)
    {
        int blankspace = 0;
        length = inputSentence.length();
        for(int i=0;i<length;i++)
        {
            if(inputSentence.charAt(i)==' ')
                blankspace++;
        }
        return blankspace;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SentenceProcessor sentence = new SentenceProcessor();
        // Step 1: Accept the input sentence
        System.out.println("Enter a sentence in uppercase (terminate with '.', '?', or '!'):");
        String inputSentence = sc.nextLine().trim();
        // Step 2: Check the validity of the terminating character
        char lastChar = inputSentence.charAt(inputSentence.length() - 1);
        if (!(lastChar == '.' || lastChar == '?' || lastChar == '!')) {
            System.out.println("Invalid terminating character. Sentence must end with '.', '?', or '!'");
            System.exit(0);
        }
        inputSentence = inputSentence+" ";
        int numberofWords = sentence.wordCounter(inputSentence);
        // Step 3: Split the sentence into words and store them in an ArrayList
        String[] words = new String[numberofWords];
        words = sentence.wordSplitter(words, inputSentence);
        for (int i = 0; i < numberofWords; i++) {
            if (words[i].length() > 15) {
                System.out.println("Character Limit Exceeds for the word " + words[i]);
                System.exit(0);
            }
        }
        // Step 4: Sort the words based on lengths and then alphabetically
        for (int i = 0; i < numberofWords - 1; i++) {
            for (int j = 0; j < numberofWords - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
                else if (words[j].length() == words[j + 1].length()) {
                    if (words[j].compareTo(words[j + 1]) > 0) {
                        String temp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = temp;
                    }
                }
            }
        }
        // Step 5: Display the original and converted sentences
        System.out.println("Original Sentence: " + inputSentence);
        System.out.print("Converted Sentence: ");
        for (int i = 0; i < numberofWords; i++) {
                System.out.print(words[i] + " ");
        }
    }
}