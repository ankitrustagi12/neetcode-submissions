class Solution {
    int res =0;
    public int subsetXORSum(int[] nums) {
        helper(0, nums.length, nums, new ArrayList<>(),0);
        return res;
    }

    void helper(int idx, int n, int[] nums, List<Integer> list, int xorr){
        if(idx==n){
            res += xorr;
            return;
        }

        helper(idx+1,n,nums,list, xorr);

        list.add(nums[idx]);
        helper(idx+1,n, nums, list, xorr ^ nums[idx]);
        list.remove(list.size()-1);
    }
}