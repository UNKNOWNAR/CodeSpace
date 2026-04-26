/*Question 10
Define a class called Student to check whether a student is eligible for taking admission in class XI with the following specifications:
Data Members    Purpose
String name to store name
int mm  to store marks secured in Maths
int scm to store marks secured in Science
double comp to store marks secured in Computer
Member Methods  Purpose
Student( )  parameterised constructor to initialize the data members by accepting the details of a student
check( )    to check the eligibility for course based on the table given below
void display()  to print the eligibility by using check() function in nested form
Marks   Eligibility
90% or more in all the subjects Science with Computer
Average marks 90% or more   Bio-Science
Average marks 80% or more and less than 90% Science with Hindi
Write the main method to create an object of the class and call all the member methods.*/
import java.io.*;
public class Student
{
    String name;
    int mm;
    int scm;
    int comp;
    Student() throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);        
        System.out.println("Enter Your Name:- ");
        name  = dis.readLine();
        System.out.println("Enter Your Marks Secured in Maths:- ");
        mm  = Integer.parseInt(dis.readLine());
        System.out.println("Enter Your Marks Secured in Science:- ");
        scm  = Integer.parseInt(dis.readLine());
        System.out.println("Enter Your Marks Secured in Computer:- ");
        comp  = Integer.parseInt(dis.readLine());
    }
    public String check()
    {
        double avg = mm+scm+comp/3.0;
        String eligibility  = "";
        if(mm>=90&&scm>=90&&comp>=90)
        {
            eligibility="You are Eligible for Science with Computer";
        }
        if(avg>=90)
        {
            eligibility="You are Eligible for Science with Biology";
        }
        if(avg>90&&avg<=80)
        {
            eligibility="You are Eligible for Science with Hindi";
        }
        return eligibility;
    }
    public void display() 
    {
        String e = check();
        System.out.println(e);
    }
    public static void main(String args[]) throws IOException
    {        
        Student obj = new Student();
        obj.display();
    }
}