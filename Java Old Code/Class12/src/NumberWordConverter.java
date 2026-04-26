import java.util.*;
public class NumberWordConverter {
    // Method to convert a digit in the ones place to its word representation.
    String convertOnesPlaceToWord(int digit) {
        switch (digit) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }
    // Method to convert a digit in the teens place to its word representation.
    String convertTeensPlaceToWord(int digit) {
        switch (digit) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }
    // Method to convert a digit in the tens place to its word representation.
    String convertTensPlaceToWord(int digit) {
        switch (digit) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberWordConverter converter = new NumberWordConverter();
        // Prompt the user for input.
        System.out.println("Enter A Number less than 10000");
        int inputNumber = sc.nextInt();
        // Check if the input number is out of range.
        if (inputNumber < 0 || inputNumber >= 10000) {
            System.out.println("Number out of range. Please enter a number less than 10000.");
            System.exit(0);
        }
        String wordRepresentation = "";
        // convert Thousands place
        if (inputNumber >= 1000) {
            wordRepresentation += converter.convertOnesPlaceToWord(inputNumber / 1000) + " thousand";
            inputNumber %= 1000;
            if (inputNumber > 0) {
                wordRepresentation += " and ";
            }
        }
        // convert Hundreds place
        if (inputNumber >= 100) {
            wordRepresentation += converter.convertOnesPlaceToWord(inputNumber / 100) + " hundred";
            inputNumber %= 100;
            if (inputNumber > 0) {
                wordRepresentation += " and ";
            }
        }
        // convert Tens and ones places
        if (inputNumber >= 20) {
            wordRepresentation += converter.convertTensPlaceToWord(inputNumber / 10);
            inputNumber %= 10;
            if (inputNumber > 0) {
                wordRepresentation += " " + converter.convertOnesPlaceToWord(inputNumber);
            }
        } else if (inputNumber >= 10) {
            wordRepresentation += converter.convertTeensPlaceToWord(inputNumber);
        } else if (inputNumber > 0) {
            wordRepresentation += converter.convertOnesPlaceToWord(inputNumber);
        }
        // Display the word representation of the input number.
        System.out.println("Word Representation: " + wordRepresentation);
    }
}