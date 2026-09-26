class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length(), left=0, whites=0, res = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            char c = blocks.charAt(i);
            if(c=='W') whites++;
            if( (i-left+1)==k ){
                res = Math.min(whites, res);
                c = blocks.charAt(left);
                if(c=='W') whites--;
                left++;
            }
        }
        return res;
    }
}