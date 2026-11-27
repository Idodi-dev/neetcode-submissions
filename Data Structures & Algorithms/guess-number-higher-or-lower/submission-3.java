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

        int high = n;
        int low = 1;
        int midpoint = high / 2 + low / 2;
        int res = 0;

        if(high % 2 == 1 && low % 2 == 1) {
            midpoint++;
        }

        while(high - low > 2) {
            res = guess(midpoint);

            if(res == 0) {
                return midpoint;
            }

            if(res == -1) {
                high = midpoint + 1;
            } else if(res == 1) {
                low = midpoint + 1;
            } 

            midpoint = high / 2 + low / 2;

            if(high % 2 == 1 && low % 2 == 1) {
                midpoint++;
            }
        }

        res = guess(midpoint);

        if(res == -1) {
            return low;
        } else if(res == 1) {
            return high;
        }  else {
            return midpoint;
        }


        
    }
}