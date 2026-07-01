class Solution 
{
    static
    {
        for(int i =0;i<200;i++)
        {
            firstUniqChar("a");
        }
    }

    public static int firstUniqChar(String s) 
    {
        int ch[]=new int[26];
        char sChar[]=s.toCharArray();
        for (char i: sChar)
        {
            ch[i-'a']++;
        }
        for (int i=0;i<sChar.length;i++)
        {
            if (ch[sChar[i]-'a']==1)
            {
                return i;
            }
        }
        return -1;
        
    }
}
