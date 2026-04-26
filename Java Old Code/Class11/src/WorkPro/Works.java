package WorkPro; 
public class Works
{
    public int wordcount(String w)
    {
        w=w.toLowerCase()+" ";
        int l = w.length();
        String nw="";
        int f = 0;
        int vw=0;
        for(int i=0;i<l;i++)
        {
            char ch = w.charAt(i);
            if(ch!=' ')
                nw += w.charAt(i);
            else
            {
                char c=w.charAt(f);
                char c1= w.charAt(i-1);
                int v=0;
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    v++;
                if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
                    v++;
                vw += (v==2)?1:0;
                nw="";
                f=i+1;
            }
        }
        return vw;
    }
}