class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        getAllSubsets(nums,0,nums.length, new ArrayList<>(), res);
        return res;
    }

    void getAllSubsets(int[] nums, int idx, int n, List<Integer> curr, List<List<Integer>> res){
        res.add( new ArrayList<>(curr));

        for(int i=idx;i<n;i++){
            curr.add(nums[i]);
            getAllSubsets(nums,i+1,n,curr, res);
            curr.remove(curr.size()-1);
        }
    }
}
