class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        boolean samePrefix = true;
        int counter = 0;
        int minLength = strs[0].length();

        for(int i = 1; i < strs.length; i++) {
            int currLength = strs[i].length();

            if(currLength < minLength) {
                minLength = currLength;
            }
        }

        while(counter < minLength && samePrefix) {
            for(int i = 0; i < strs.length - 1; i++) {
                if(strs[i].charAt(counter) != strs[i + 1].charAt(counter)) {
                    samePrefix = false;
                }
            }
            if(samePrefix) {
                result += strs[0].charAt(counter);
            }
            counter++;
        }

        return result;
    }
}