class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        boolean dupes = false;
        int index = 0;

        while(!dupes && index < nums.length) {
            int elem = nums[index];
            if(!seen.contains(elem)) {
                seen.add(elem);
            } else {
                dupes = true;
            }

            index++;
        }

        return dupes;
    }
}