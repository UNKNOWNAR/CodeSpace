import java.util.*;
public class Marks extends Student{
    float p;
    float c;
    float m;
    float cts;
    float e;
    float tot;
    float per;
    char gd;
    void readdata()
    {
        inputdata();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks in Physics");
        p = sc.nextFloat();
        System.out.println("Enter Marks in Chemistry");
        c = sc.nextFloat();
        System.out.println("Enter Marks in Mathematics");
        m = sc.nextFloat();
        System.out.println("Enter Marks in Computer Science");
        cts = sc.nextFloat();
        System.out.println("Enter Marks in English");
        e = sc.nextFloat();
    }
    void compute()
    {
        tot = p+c+m+cts+e;
        per = tot/5;
        if(per>=90)
            gd = 'A';
        else if(per>=60&&per<90)
            gd = 'B';
        else if(per>=40&&per<60)
            gd = 'C';
        else if(per<40)
            gd = 'D';
    }
    void showdata()
    {
        printdata();
        System.out.println("Marks in Physics: "+p);
        System.out.println("Marks in Chemistry: "+c);
        System.out.println("Marks in Mathematics: "+m);
        System.out.println("Marks in Computer Science: "+cts);
        System.out.println("Marks in English: "+e);
    }
    public static void main(String[] args) {
        Marks M1 = new Marks();
        M1.readdata();
        M1.compute();
        M1.showdata();
    }
}