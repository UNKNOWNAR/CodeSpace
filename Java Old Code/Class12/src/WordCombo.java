import java.util.*;
public class WordCombo {
    public static List<String> generateAnagrams(String word) {
        List<String> anagrams = new ArrayList<>();
        generateAnagramsHelper("", word, new HashSet<>(), anagrams);
        return anagrams;
    }

    private static void generateAnagramsHelper(String prefix, String remaining, Set<Character> usedChars, List<String> anagrams) {
        if (remaining.length() == 0) {
            anagrams.add(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char current = remaining.charAt(i);
            if (!usedChars.contains(current)) {
                usedChars.add(current);
                generateAnagramsHelper(prefix + current, remaining.substring(0, i) + remaining.substring(i + 1), usedChars, anagrams);
                usedChars.remove(current);
            }
        }
    }

    public static void main(String[] args) {
        String input = "BOK";
        List<String> anagrams = generateAnagrams(input);

        System.out.println("Sample Input: " + input);
        System.out.println("Sample Output:");
        for (String anagram : anagrams) {
            System.out.println(anagram);
        }
        System.out.println("Number of anagrams: " + anagrams.size());
    }
}
