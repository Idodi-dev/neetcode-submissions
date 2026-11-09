class Solution {
    public int countSeniors(String[] details) {
        
        int count = 0;

        for (String elem : details) {
            String ageAsString = elem.substring(11, 13);
            int age = Integer.parseInt(ageAsString);

            if(age > 60) {
                count++;
            }
        }

        return count;
    }
}