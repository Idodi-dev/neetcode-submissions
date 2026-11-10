class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<HashMap<Character, Integer>> listOfMaps = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();

        for(String word : strs) {
            HashMap<Character, Integer> currMap = wordAsCharMap(word);

            if(listOfMaps.contains(currMap)) {
                int indexInResult = listOfMaps.indexOf(currMap);
                result.get(indexInResult).add(word);
            } else {
                listOfMaps.add(currMap);
                List<String> newLetters = new ArrayList<>();
                newLetters.add(word);
                result.add(newLetters);
            }
        }

        return result;
    }

    public HashMap<Character, Integer> wordAsCharMap(String word) {
        HashMap<Character, Integer> result = new HashMap<>();

        char c = 'a';

        while(word.length() > 0) {

            if(!word.equals("")) {
                c = word.charAt(0);
                word = word.substring(1);
            }
            
            
            if(!result.containsKey(c)) {
                result.put(c, 1);
            } else {
                int cVal = result.get(c);
                result.replace(c, cVal, cVal + 1);
            }
        }

        return result;
    }
}
