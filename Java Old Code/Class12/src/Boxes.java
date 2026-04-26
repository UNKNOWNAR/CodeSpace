/*Question 1
A company manufactures packing cartons in four sizes, i.e. cartons to accommodate 6 boxes, 12 boxes, 24 boxes and
48 boxes. Design a program to accept the number of boxes to be packed (N) by the user (maximum up to 1000 boxes) and
display the break-up of the cartons used in descending order of capacity (i.e. preference should be given to the highest
capacity available, and if boxes left are less than 6, an extra carton of capacity 6 should be used.)

Test your program with the following data and some random data:

Example 1

INPUT:
N = 726

OUTPUT:
48 * 15 = 720
6 * 1 = 6
Remaining boxes = 0
Total number of boxes = 726
Total number of cartons = 16

Example 2

INPUT:
N = 140

OUTPUT:
48 * 2 = 96
24 * 1 = 24
12 * 1 = 12
6 * 1 = 6
Remaining boxes = 2 * 1 = 2
Total number of boxes = 140
Total number of cartons = 6

Example 3

INPUT:
N = 4296

OUTPUT:
INVALID INPUT*/
import java.util.*;
public class Boxes
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Boxes");
        int N = sc.nextInt();
        if(N>1000)
            System.out.println("Wrong Input");
        int cont48 = 0;
        int cont24 = 0;
        int cont12 = 0;
        int cont6 = 0;
        int remainingboxes = 0;
        if(N>48)
        {
            cont48 = N/48;
            N -= cont48*48;
        }
        if(N>24)
        {
            cont24 = N/24;
            N -= cont24*24;
        }
        if(N>12)
        {
            cont12 = N/12;
            N -= cont12*12;
        }
        if(N>6)
        {
            cont6 = N/6;
            N -= cont6*6;
        }
        if(N>0)
            remainingboxes = N;
        if(remainingboxes>0)
            System.out.println("Remainig Boxes:- "+remainingboxes);
        if(cont48>0)
            System.out.println("48 x "+cont48+" = "+(cont48*48));
        if(cont24>0)
            System.out.println("24 x "+cont24+" = "+(cont24*24));
        if(cont12>0)
            System.out.println("12 x "+cont12+" = "+(cont12*12));
        if(cont6>0)
            System.out.println("6 x "+cont6+" = "+(cont6*6));
    }
}