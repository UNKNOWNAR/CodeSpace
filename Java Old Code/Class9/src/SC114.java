/*In a competitive examination, a set of 'N' number of questions results in 'True' or 'False'. Write a program by using scanner class to accept the answers. Print the frequency of 'True' and 'False'.*/
import java.util.Scanner;
public class SC114
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Questions:- ");
        int q = in.nextInt();
        int i = 1,nt = 0,nf = 0;
        while(i<=q)
        {
            System.out.println("Enter Your Answer is \"True\" or \"False\"");
            String a =in.next();
            nt = (a=="True")?nt+1:nt+0;
            i++;
        }
        nf = q - nt;
        System.out.println("NUMBER OF \"TRUE\" :-"+nt);
        System.out.println("NUMBER OF \"FALSE\" :-"+nf);
    }
}
