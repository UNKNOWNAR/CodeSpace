/* Consider a String: THE COLD WATER AND THE HOT WATER GLASSES ARE KEPT ON THE TABLE Write a program by using scanner class to enter the string and display the new string after removing repeating token 'THE'. The new string is: COLD WATER AND HOT WATER GLASSES ARE KEPT ON TABLE*/
    import java.util.Scanner;
    public class SC1110
    {
        public static void main(String[] args)
        {
            Scanner in =  new  Scanner(System.in);
            System.out.println("Enter The Sentence:- ");
            String str = in.nextLine();
            str = str + " ";
            int l = str.length();
            String word = "";
            int i = 0;
            while (i < l)
            {
                char ch = str.charAt(i);
                if (ch != ' ') 
                {
                    word = word + ch;
                }
                else 
                {
                    if(!word.equals("THE"))
                    {
                        System.out.print(word+" ");
                    }
                    word="";
                }
                i = i + 1;
            }
        }
    }
