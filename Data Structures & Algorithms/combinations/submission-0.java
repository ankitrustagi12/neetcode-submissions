class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int[] nums = new int[n];
        for(int i=1;i<=n;i++) nums[i-1] = i;
        helper(nums,0,n,new ArrayList<>(), res, k);
        return res;
    }

    void helper(int[] nums, int idx, int n, List<Integer> curr, List<List<Integer>> res, int k){
        if(curr.size()==k) {
            res.add( new ArrayList<>(curr));
            return;
        }

        for(int i=idx;i<n;i++){
            curr.add(nums[i]);
            helper(nums,i+1,n, curr, res,k);
            curr.remove(curr.size()-1);
        }
    }
}