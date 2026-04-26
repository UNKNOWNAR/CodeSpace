import java.util.*;
public class Student {
    String name;
    String dob;
    int roll;
    void inputdata()
    {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        dob = sc.nextLine();
        roll = sc.nextInt();
    }
    void printdata()
    {
        System.out.println("Name:- "+name);
        System.out.println("Date of Birth:- "+dob);
        System.out.println("Roll No:-"+roll);
    }
}