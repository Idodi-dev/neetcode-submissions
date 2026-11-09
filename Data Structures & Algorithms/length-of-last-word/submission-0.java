class Solution {
    public int lengthOfLastWord(String s) {
        String realS = s.trim();

        int counter = 0;

        for(int i = realS.length() - 1; i >= 0; i--) {
            if(realS.charAt(i) != ' ') {
                counter++;
            } else {
                break;
            }
        }

        return counter;
    }
}