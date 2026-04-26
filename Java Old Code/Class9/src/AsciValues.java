/*Write a C program to print all ASCII character with their values.*/
public class AsciValues
{
    public static void main ( String args [])
    { 
        char c = 32;
        int i = 0;
        while(c<=127)
        {
            i = (char)c;
            System.out.println("Value of "+c+" in ASCII:- "+i);
            c++;
        }
    }
}
       