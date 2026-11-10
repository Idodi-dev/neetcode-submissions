class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        if(numRows == 0) {
            return new ArrayList<>();
        } else if(numRows == 1) {

            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            result.get(0).add(1);

            return result;
        }

        List<List<Integer>> result = generate(numRows - 1);
        List<Integer> newRow = new ArrayList<>();
        newRow.add(1);

        for(int i = 0; i < numRows - 2; i++) {

            int k = result.get(numRows-2).get(i);
            int kPlus1 = result.get(numRows-2).get(i+1);

            newRow.add(k + kPlus1);
        }

        newRow.add(1);

        result.add(newRow);

        return result;
    } 
}