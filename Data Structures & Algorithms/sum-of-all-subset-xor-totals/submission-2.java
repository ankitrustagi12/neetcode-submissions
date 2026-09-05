class Solution {
    int res =0;
    public int subsetXORSum(int[] nums) {
        helper(0, nums.length, nums,0);
        return res;
    }

    void helper(int idx, int n, int[] nums, int xorr){
        if(idx==n){
            res += xorr;
            return;
        }

        helper(idx+1,n,nums, xorr);
        helper(idx+1,n, nums, xorr ^ nums[idx]);
    }
}