class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<int[], List<String>> mapping = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String word : strs) {

            int[] charFreqs = new int[26];

            for(int i = 0; i < word.length(); i++) {
                int index = 'z' - word.charAt(i);
                charFreqs[index]++;
            }

            boolean arrayExistsAlready = false;

            for(int[] arr : mapping.keySet()) {
                if(Arrays.equals(arr, charFreqs)) {
                    arrayExistsAlready = true;
                    charFreqs = arr;
                }
            }

            if(arrayExistsAlready) {
                List<String> currList = mapping.get(charFreqs);
                currList.add(word);
                mapping.replace(charFreqs, currList);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(word);
                mapping.put(charFreqs, newList);
            }
        }

        for(List<String> list : mapping.values()) {
            result.add(list);
        }

        return result;
    }
}
