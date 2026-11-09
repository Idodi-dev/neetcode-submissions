class Solution {
    public List<String> stringMatching(String[] words) {
        
        List<String> res = new ArrayList<>();
        
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words.length; j++) {
                String a = words[i];
                String b = words[j];
                
                if(!res.contains(b) && !a.equals(b) &&a.contains(b)) {
                    res.add(b);
                } 
            }
        }

        return res;
    }
}