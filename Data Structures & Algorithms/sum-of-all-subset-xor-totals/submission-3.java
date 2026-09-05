class Solution {
    int res =0;
    public int subsetXORSum(int[] nums) {
        return helper(0, nums.length, nums,0);
    }

    int helper(int idx, int n, int[] nums, int xorr){
        if(idx==n){
            return xorr;
        }

        return helper(idx+1,n,nums, xorr) + helper(idx+1,n, nums, xorr ^ nums[idx]);
    }
}