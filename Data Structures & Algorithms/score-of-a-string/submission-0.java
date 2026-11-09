class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int index = 0;

        while(index < s.length() - 1) {
            char current = s.charAt(index);
            char next = s.charAt(index + 1);

            score += Math.abs(next - current);
            index++;
        }

        return score;
    }
}