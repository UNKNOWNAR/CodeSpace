import java.util.*;
public class Encode {
    String word;
    int length;
    String new_word;

    Encode() {
        word = "";
        length = 0;
        new_word = "";
    }
    void acceoptWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Word:- ");
        word = sc.next();
        length = word.length();
    }
    void nextVowel() {
        for (int i = 0; i < length; i++) {
            char c = word.charAt(i);
            switch (c) {
                case 'A':
                    c = 'E';
                    break;
                case 'E':
                    c = 'I';
                    break;
                case 'I':
                    c = 'O';
                    break;
                case 'O':
                    c = 'U';
                    break;
                case 'U':
                    c = 'A';
                    break;
                case 'a':
                    c = 'e';
                    break;
                case 'e':
                    c = 'i';
                    break;
                case 'i':
                    c = 'o';
                    break;
                case 'o':
                    c = 'u';
                    break;
                case 'u':
                    c = 'a';
            }
            new_word += c;
        }
    }
    void display() {
        System.out.println("Input:- " + word);
        System.out.println("Output:- " + new_word);
    }
    public static void main(String[] args) {
        Encode ob = new Encode();
        ob.acceoptWord();
        ob.nextVowel();
        ob.display();
    }
}