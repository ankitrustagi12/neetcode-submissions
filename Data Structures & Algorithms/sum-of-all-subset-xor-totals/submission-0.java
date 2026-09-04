class Solution {
    int res =0;
    public int subsetXORSum(int[] nums) {
        helper(0, nums.length, nums, new ArrayList<>());
        return res;
    }

    void helper(int idx, int n, int[] nums, List<Integer> list){
        if(idx==n){
            int xorr = 0;
            for (int num : list) xorr ^= num;
            res += xorr;
            return;
        }

        helper(idx+1,n,nums,list);

        list.add(nums[idx]);
        helper(idx+1,n, nums, list);
        list.remove(list.size()-1);
    }
}