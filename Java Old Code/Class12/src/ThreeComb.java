import java.util.*;
public class ThreeComb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Three Letter Word:-");
        String word = sc.nextLine();
        char[][] wordComb = new char[6][3];
        int k=0;
        for(int i=0;i<3;i++)
        {
            switch (i)
            {
                case 0: {
                    for (int j = 0; j < 6; j++) {
                        wordComb[j][i] = word.charAt(j/2);
                    }
                    break;
                }
                case 1:
                {
                    for(int j=0;j<6;j++)
                    {
                        while (word.charAt(k) == wordComb[j][i-1]) {
                            k++;
                            k = (k==3)?0:k;
                        }
                        wordComb[j][i] = word.charAt(k);
                        k++;
                        k = (k==3)?0:k;
                    }
                    break;
                }
                case 2:
                {
                    k=0;
                    for(int j=0;j<6;j++) {
                        while (word.charAt(k) == wordComb[j][i-1] || word.charAt(k) == wordComb[j][i-2])
                        {
                            k++;
                            k = (k==3)?0:k;
                        }
                        wordComb[j][i] = word.charAt(k);
                        k++;
                        k = (k==3)?0:k;
                    }
                    break;
                }
            }
        }
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print(wordComb[i][j]);
            System.out.println();
        }
    }
}