/*Write a C program to check whether a character is alphabet or not.
Write a C program to input any alphabet and check whether it is vowel or consonant.
Write a C program to input any character and check whether it is alphabet, digit or special character.
Write a C program to check whether a character is uppercase or lowercase alphabet.*/
import java.io.*;
public class Charecter
{
    public static void main ( String args [])throws IOException
    { 
      DataInputStream dis = new DataInputStream(System.in);
      System.out.println("ENTER A Charecter");
      char a = dis.readLine().charAt(0);
      if (a >= 65 && a<=90 || a >= 97 && a <= 122)
      {
          System.out.println(a +" is an alphbet");
          if (a == 'a' | a == 'e' | a == 'i' | a == 'o' | a == 'u' | a == 'A' | a == 'E'| a == 'I' | a == 'O' | a == 'U')
          {
              System.out.println(a +" is a vowel");
          }
          else
          {
              System.out.println(a +" is a consonant.");
          }
          if (a >= 65 && a<=90)
          {
              System.out.println(a +" is an Upper Case Alphabet ");
          }
          else
          {
              System.out.println(a +" is an Lower Case Alphabet ");
          }
      }
      if (a >= 48 && a<=57)
      {
          System.out.println(a +" is a number");
      }
      else
      {
              System.out.println(a +" is a special charecter");
      }
    }
}