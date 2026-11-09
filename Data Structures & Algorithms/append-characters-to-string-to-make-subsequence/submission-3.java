class Solution {
    public int appendCharacters(String s, String t) {
        int tPoint = 0;
        int sPoint = 0;
        int tLength = t.length();
        int sLength = s.length();

        while(sPoint < sLength && tPoint < tLength) {
            if(s.charAt(sPoint) == t.charAt(tPoint)) {
                tPoint++;
            }
            sPoint++;
        }

        if(tPoint == tLength) {
            return 0;
        } else {
            return tLength - tPoint;
        }
    }
}