/*Write a program to declare a matrix A[][] of order (M x N) where 'M' is the number of rows and 'N' is the
number of columns such that the value of 'M' must be greater than 0 and less than 10 and the value of 'N' must be greater
than 2 and less than 6. Allow the user to input digits (0 - 7) only at each location, such that each row represents an
octal number.

Example:

2	3	1	(decimal equivalent of 1st row = 153 i.e. 2x82 + 3x81 + 1x80)
4	0	5	(decimal equivalent of 2nd row = 261 i.e. 4x82 + 0x81 + 5x80)
1	5	6	(decimal equivalent of 3rd row = 110 i.e. 1x82 + 5x81 + 6x80)
Perform the following tasks on the matrix:

Display the original matrix.
Calculate the decimal equivalent for each row and display as per the format given below.
Test your program for the following data and some random data:

Example 1:

INPUT:
M = 1
N = 3
ENTER ELEMENTS FOR ROW 1: 1 4 4

OUTPUT:

FILLED MATRIX	DECIMAL EQUIVALENT
1	4	4	100

Example 2:

INPUT:
M = 3
N = 4
ENTER ELEMENTS FOR ROW 1: 1 1 3 7
ENTER ELEMENTS FOR ROW 2: 2 1 0 6
ENTER ELEMENTS FOR ROW 3: 0 2 4 5

OUTPUT:

FILLED MATRIX	DECIMAL EQUIVALENT
1	1	3	7	607
2	1	0	6	1094
0	2	4	5	165

Example 3:

INPUT:
M = 3
N = 3
ENTER ELEMENTS FOR ROW 1: 2 4 8

OUTPUT:
INVALID INPUT

Example 4:

INPUT:
M = 4
N = 6

OUTPUT:
OUT OF RANGE*/
import java.util.*;
public class OctalMatrix {
    int OctalConversion(int n)
    {
        int i =0;
        int octal = 0;
        while (n>0)
        {
            octal = octal*10+(int)Math.pow(2,i)*(n%10);
            n/=10;
            i++;
        }
        return octal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows:-");
        int m = sc.nextInt();
        System.out.println("Enter Number of Columns:-");
        int n = sc.nextInt();
        if(!(m>0 && m<10 || n>2 && n<6)) {
            System.out.println("Out Of Range");
            System.exit(0);
        }
        int matrix[][] = new int[m][n];
        int Octal[] = new int[m];
        OctalMatrix octal = new OctalMatrix();
        for(int i=0;i<m;i++)
        {
            System.out.println("ENTER ELEMENTS FOR ROW "+i+" :");
            String str = sc.next();
            int number = 0;
            for(int j=0;j<n;j++)
            {
                if(Character.isDigit(str.charAt(j))) {
                    int x = Integer.parseInt(str.charAt(j) + "");
                    number = number*10+x;
                    matrix[i][j] = x;
                }
            }
            Octal[i] = octal.OctalConversion(number);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(matrix[i][j]+ " ");
            System.out.println("\tDecimal Equivalent:- "+Octal[i]);
        }
    }
}