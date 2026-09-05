class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        getAllSubsets(nums,0,nums.length, new ArrayList<>(), res);
        return res;
    }

    void getAllSubsets(int[] nums, int idx, int n, List<Integer> curr, List<List<Integer>> res){
        if(idx==n){
            res.add( new ArrayList<>(curr));
            return;
        }
        getAllSubsets(nums,idx+1,n,curr,res);

        curr.add(nums[idx]);
        getAllSubsets(nums,idx+1,n,curr,res);
        curr.remove(curr.size()-1);
    }
}
