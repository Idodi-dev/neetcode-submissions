class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int index = 0;

        while(index < s.length() - 1) {
            char current = s.charAt(index);
            char next = s.charAt(index + 1);

            int val = current - next;

            if(val < 0) {
                val *= -1;
            }

            score += val;
            index++;
        }

        return score;
    }
}