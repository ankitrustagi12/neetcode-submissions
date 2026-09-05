class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        helper(nums,0,n,new ArrayList<>());
        return res;
    }

    void helper(int[] nums,int idx, int n, List<Integer> curr){
        if(idx==n){
            res.add(new ArrayList<>(curr));
            return;
        }
        int j = idx;
        while(idx+1<n && nums[idx]==nums[idx+1]) idx++;
        helper(nums,idx+1,n,curr);

        curr.add(nums[j]);
        helper(nums,j+1,n,curr);
        curr.remove(curr.size()-1);

        
    }
}
