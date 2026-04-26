/*1.	A class “Teacher” defines the related information such as name, date of birth and the date of joining
while another class “Principal” defines the different functions to display the relative information about the
teachers. The details of both the classes are given below:
Class Name			: Teacher
Data members/instance variables:
String name[], dob[], doj[]	: String variable to store name, date of birth and date of joining of 50 teachers.
Member functions/methods:
void getdata()	: To input the values of all the data members.
void show_getdata()	: To display all the data members with suitable headings.

Class Name	: Principal
Member functions/methods:
void sortdata()	: To sort the arrays based on alphabetical order of names using the bubble sort technique.
void display()	: To display the sorted list of all the data members with suitable headings.
void searchdata()	: To input the name of a teacher and search for it using sequential search technique. If
found, print the details of the searched item, otherwise print an appropriate message.
(i)	Specify the class Teacher giving the details of functions void getdata() and void show_getdata().
(ii)	Using concept of inheritance, specify the class Principal giving the details of functions void sortdata(),
 void display() and void searchdata(). The class Principal is derived from class Teacher.
*/
import java.util.*;
public class Teacher {
    String[] name = new String[50];
    String[] dob = new String[50];
    String[] doj = new String[50];
    void getdata() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            System.out.println("Enter Teacher " + (i + 1) + " details:");
            System.out.println("Name: ");
            name[i] = sc.nextLine();
            System.out.println("Date of Birth: ");
            dob[i] = sc.nextLine();
            System.out.println("Date of Joining: ");
            doj[i] = sc.nextLine();
        }
    }
        void show_getdata()
        {
            System.out.println("Teacher Details:");
            System.out.println("Name\tDate of Birth\tDate of Joining");
            for (int i = 0; i < 50; i++) {
                System.out.println(name[i] + "\t" + dob[i] + "\t" + doj[i]);
        }
    }
}