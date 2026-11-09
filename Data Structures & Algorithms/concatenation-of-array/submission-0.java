class Solution {
    public int[] getConcatenation(int[] nums) {

        int originalLength = nums.length;

        int[] ans = new int[2 * originalLength];

        for(int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % originalLength];
        }

        return ans;
    }
}