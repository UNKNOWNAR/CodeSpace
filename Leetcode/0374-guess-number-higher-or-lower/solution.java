/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 0;
        int high = n;
        int mid = low+(high-low)/2;
        while(true){
            int feedback = guess(mid);
            if(feedback==0)
                break;
            else if(feedback>0)
                low = mid+1;
            else
                high = mid-1;
            mid = low+(high-low)/2;
        }
        return mid;
    }
}
