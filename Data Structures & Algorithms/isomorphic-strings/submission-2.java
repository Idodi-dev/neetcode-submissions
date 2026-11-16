class Solution {
    public boolean isIsomorphic(String s, String t) {
        String res = "";
        int sLen = s.length();

        s = s.toLowerCase();
        t = t.toLowerCase();

        if(sLen != t.length()) {
            return false;
        } else {
            HashMap<Character, Character> mapping = new HashMap<>();

            for(int i = 0; i < sLen; i++) {

                char sChar = s.charAt(i);
                char tChar = t.charAt(i);

                boolean keyExists = mapping.containsKey(sChar);
                boolean valueExistsAlready = mapping.containsValue(tChar);

                if(!keyExists && !valueExistsAlready) {
                    mapping.put(sChar, tChar);
                } else if (keyExists && mapping.get(sChar) == tChar){
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}