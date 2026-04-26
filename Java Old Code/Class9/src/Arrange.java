//Question 4
//Define a class Arrange described as below:
//Data members/instance variables:
//String str (a word)
//String i
//int p (to store the length of the word)
//char ch;
//Member Methods:
//A parameterised constructor to initialize the data member
//To accept the word
//To arrange all the alphabets of word in ascending order of their ASCII values without using the sorting technique
//To display the arranged alphabets.
//Write a main method to create an object of the class and call the above member methods.
import java.io.*;
public class Arrange
{
    String str;
    String i;
    int p;
    char ch;
    Arrange()
    {
        i="";
        p=0;
        ch = ' ';
        str = "";
    }
    public void input() throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);            
        System.out.println("Enter Word:- ");
        str = dis.readLine();
    }
    public void rearrange()
    {
        int k=97;
        while(k<123)
        {
            char c = (char)k;
            int j=0;
            while(j<str.length())
            {
                char ch = str.charAt(j);
                char chcopy = ch<97?(char)(ch+32):ch;
                if(c==chcopy)
                    i +=ch;
                j++;
            }
            k++;
        }
    }
    public void display()
    {
         System.out.println("Rearranged Word:- "+i);
    }
    public static void main(String args[]) throws IOException
    {
        Arrange no = new Arrange();
        no.input();
        no.rearrange();
        no.display();
    }
}