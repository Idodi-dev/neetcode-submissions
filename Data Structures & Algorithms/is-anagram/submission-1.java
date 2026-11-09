class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> letterCountsS = new HashMap<>();
        HashMap<Character, Integer> letterCountsT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentS = s.charAt(i);
            char currentT = t.charAt(i);

            letterCountsS.put(currentS, letterCountsS.getOrDefault(currentS, 0) + 1);
            letterCountsT.put(currentT, letterCountsT.getOrDefault(currentT, 0) + 1);
        }

        return letterCountsS.equals(letterCountsT);


    }
}
