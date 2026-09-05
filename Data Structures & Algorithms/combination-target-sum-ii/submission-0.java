class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(nums,0,nums.length, target, new ArrayList<>(), res);
        return res;
    }

    void helper(int[] nums, int idx, int n, int target, List<Integer> curr, List<List<Integer>> res){
        if(target==0) {
            res.add( new ArrayList<>(curr));
        }
        if(target<=0 || idx==n) return;
        
        curr.add(nums[idx]);
        helper(nums,idx+1,n,target-nums[idx],curr, res);
        curr.remove(curr.size()-1);

        while(idx+1<nums.length && nums[idx]==nums[idx+1]) idx++;
        helper(nums,idx+1,n,target,curr, res);
    }
}
