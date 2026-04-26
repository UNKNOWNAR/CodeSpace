import java.io.*;
public class Structures1
{
    int c,h,ns;
    int C[][];
    String display[][];
    Structures1() throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Number of Carbon atom:-");
        c = Integer.parseInt(dis.readLine());
        System.out.println("Enter Number of Hydrogen atom:-");
        h = Integer.parseInt(dis.readLine());
        //THIS ARRAY STORES THE CABON AND HYDROGEN BONDS IN CONDENSED FORM
        C = new int[c][2];
        ns = 3+2*c;
        //THIS ARRAY STORES CARBON AND HYDROGEN CHAIN
        display = new String[5][ns];
        for(int i=0;i<c;i++)
            for(int j=0;j<2;j++)
            C[i][j] = 0;
        for(int i=0;i<5;i++)
            for(int j=0;j<ns;j++)
                display[i][j] = " ";
    }
    int hydrocarbon()
    {
        int cv = 4;
        int i = 0;   
        while(i!=c)
        {
            if(i==c-2)
            {
                //CREATES DOUBLE OR TRIPLE BOND
                int cb = cv-C[i][0]+cv-C[i+1][0];
                cb -= h;
                cb=cb/2;
                C[i][0]+=cb;
                C[i+1][0]+=cb;
                C[i][1] = C[i][1]*10+cb;
            }
            else if(i+1!=c)
            {
                //CREATES SINGLE BOND
                C[i][0] +=1;
                C[i+1][0] +=1;
                C[i][1] = C[i][1]*10+1;
            }
            //ADJUSTING HYDROGEN ATOMS
            int b = cv-C[i][0];
            h -= b;
            C[i][0] += b;
            C[i][1] = C[i][1]*10+b;
            i++;
        }
        //CHECKS IF THE COMPOUND IS A HYDROCARBON OR NOT
        if(h!=0)
        {
            System.out.println("Its not a Hydrocarbon");
            System.exit(0);
        }
        return C[c-1][1];
    }
    void chain()
    {
        int l = 0;
        //CREATION OF NON CONDENSED CHAIN
        for(int i=2;i<ns-2;i+=2)
        {
            int n = C[l][1];
            l++;
            display[2][i]="C";
            //STORES CARBON-HYDROGEN BOND
            if(n%10==4)
            {
                display[2][i+1]="-";
                display[2][i+2]="H";
                n--;
            }
            if(n%10==3&&l==1)
            {
                display[2][i-1]="-";
                display[2][i-2]="H";
                n--;
            }
            else if(n%10==3&&l!=1)
            {
                display[2][i+1]="-";
                display[2][i+2]="H";
                n--;
            }
            if(n%10==2)
            {
                 display[3][i]= "|";
                 display[4][i]= "H";
                 n--;
            }
            if(n%10==1)
            {
                 display[1][i]= "|";
                 display[0][i]= "H";
                 n--;
            }
            n=n/10;
            //STORES CARBON CARBON BONDS
            if(i!=ns-3&&n>0)
            {
                 if(n==1)
                    display[2][i+1]="-";
                 else if(n==2)
                    display[2][i+1]="=";
                 else if(n==3)
                     display[2][i+1]="≡";
            }
        } 
    }
    String root_word()
    {
        //CHECKS FOR THE ROOT WORD
        switch(c)
        {
            case 1:
            return "Meth";
            case 2:
            return "Eth";
            case 3:
            return "Prop";
            case 4:
            return "But";
            case 5:
            return "Pent";
            case 6:
            return "Hex";
            case 7:
            return "Hept";
            case 8:
            return "Oct";
            case 9:
            return "Non";
            case 10:
            return "Dec";
            default:
            System.out.println("Wrong Input");
            System.exit(0);
            return "";
        }
    }
    String suffix(int m)
    {
        //CHECKS FOR TYPE OF HYDROCARBON(ALKANES,ALKENES,ALKYNES)
        switch(m)
        {
            case 2:
            return "ene";
            case 1:
            return "yne";
            default:
            return "ane";
        }
    }   
    void displayc(String w)
    {
        //PRINTS IUPAC NAME OF THE COMPOUND
        System.out.println("\t\t\t\t\t\t\t  NAME OF THE COMPOUND\n\t\t\t\t\t\t\t\t"+w);
        //PRINTS THE CONDENSED STRUCTURE
        System.out.println();
        int check = C[c-1][1];
        int s = 0;
        switch(check)
        { 
            case 2:
            s = 135-(4*c-2);
            s=s/2;
            case 1:
            s= 135-(4*c-4);
            s=s/2;
            default:
            s =135-(4*c-1);
            s=s/2;
        }
        System.out.println("\t\t\t\t\t\t\t   CONDENSED CHAIN");
        for(int ij=0;ij<s;ij++)
            System.out.print(" ");
        for(int j=0;j<c;j++)
        {
            int v = C[j][1];
            System.out.print("C");
            if(v%10==1)
                System.out.print("H");
            else if(v%10==2)
                System.out.print("H\u2082");
            else if(v%10==3)
                System.out.print("H\u2083");
            else if(C[j][1]%10==4)
                System.out.print("H\u2084");
            v = v/10;
            if(v==1)
                System.out.print("-");   
            else if(v==2)
                System.out.print("=");
            else if(v==3)
                System.out.print("≡");
        }
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t  STRUCTURE OF "+w);
        //PRINTS THE NON-CONDENSED STRUCTURE
        s=135-ns;
        s=s/2;
        for(int x=0;x<5;x++)
        {
            for(int ij=0;ij<s;ij++)
                System.out.print(" ");
            for(int j=0;j<ns;j++)
                System.out.print(display[x][j]);
            System.out.println();
        }
    }
    public static void main(String args[]) throws IOException
    {
        Structures1 ob = new Structures1();
        //CALLING DIFFERENT METHODS
        String wordc = ob.root_word();
        int v = ob.hydrocarbon();
        ob.chain();
        wordc = wordc+ob.suffix(v);
        ob.displayc(wordc);
    }
}