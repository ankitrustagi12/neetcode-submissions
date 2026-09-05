class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums,0,nums.length, res);
        return res;
    }

    void helper(int[] nums, int idx, int n, List<List<Integer>> res){
        if(idx==n) {
            List<Integer> perm = new ArrayList<>();
            for (int num : nums) perm.add(num);
            res.add(perm);
            return;
        }

        for(int i=idx;i<n;i++){
            swap(nums, idx, i);
            helper(nums,idx+1,n,res);
            swap(nums, idx, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
