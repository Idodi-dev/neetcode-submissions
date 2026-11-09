class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int sLength = s.length();
        int tLength = t.length();

        if(sLength > tLength) {
            return false;
        } else if (sLength == 0) {
            return true;
        } else {
            int sCounter = 0;
            int tCounter = 0;

            while(sCounter < sLength && tCounter < tLength) {
                if(s.charAt(sCounter) == t.charAt(tCounter)) {
                    sCounter++;
                }
                tCounter++;

                if(sLength > 0 && sCounter == sLength) {
                    return true;
                }
            }

            return false;
        } 

    }
}