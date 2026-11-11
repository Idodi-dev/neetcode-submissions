class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            int currVal = nums[i];
            int r = i + 1;

            if(currVal == val) {
                boolean nonValFound = false;
                
                while(!nonValFound && r < nums.length) {
                    
                    if(nums[r] != val) {
                        nonValFound = true;
                        r--;
                    }
                    
                    r++;
                }


                if(nonValFound) {
                    int temp = nums[r];
                    nums[r] = nums[i];
                    nums[i] = temp;
                    r = i + 1;
                }
            } 
        }

        for(int num : nums) {
            if(num != val) {
                k++;
            }
        }

        return k;
    }
}