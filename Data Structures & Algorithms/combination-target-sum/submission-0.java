class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums,0,nums.length, target, new ArrayList<>(), res);
        return res;
    }

    void helper(int[] nums, int idx, int n, int target, List<Integer> curr, List<List<Integer>> res){
        if(target==0) {
            res.add( new ArrayList<>(curr));
        }
        if(target<=0) return;

        for(int i=idx;i<n;i++){
            curr.add(nums[i]);
            helper(nums,i,n,target-nums[i],curr, res);
            curr.remove(curr.size()-1);
        }
    }
}
