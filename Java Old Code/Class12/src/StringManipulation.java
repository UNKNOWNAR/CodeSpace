import java.util.*;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Character.isLetter('P'));
        System.out.println(Character.isLetter('0'));
        System.out.println(Character.isDigit('P'));
        System.out.println(Character.isDigit('0'));
        System.out.println(Character.isLetterOrDigit('P'));
        System.out.println(Character.isLetterOrDigit('0'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('0'));
        System.out.println(Character.isUpperCase('P'));
        System.out.println(Character.isUpperCase('p'));
        System.out.println(Character.isLowerCase('P'));
        System.out.println(Character.toUpperCase('P'));
        System.out.println(Character.toUpperCase('p'));
        System.out.println(Character.toLowerCase('P'));
        System.out.println(Character.toLowerCase('p'));
        System.out.println("Computer".substring(3));
        System.out.println("Computer".substring(3, 6));
        System.out.println("Computer".toLowerCase());
        System.out.println("Computer".toUpperCase());
        System.out.println("Luck".replace('L', 'F'));
        System.out.println("Computer".equals("Computer"));
        System.out.println("Computer".equals("COMPUTER"));
        System.out.println("Computer".equalsIgnoreCase("COMPUTER"));
        System.out.println("Java Application".compareTo("Platform Independence"));//ascii substraction of Java Application
        // by Platform Independent
        System.out.println("Computer is Fun".startsWith("Fun"));
        System.out.println("Computer is Fun".endsWith("Fun"));
        System.out.println("Computer is Science".indexOf('e'));
        System.out.println("Computer is Science".indexOf('e',7));
        System.out.println("Computer is Science".indexOf("is"));
        System.out.println("Computer is Science but is fun".indexOf("is,12"));
    }
}

