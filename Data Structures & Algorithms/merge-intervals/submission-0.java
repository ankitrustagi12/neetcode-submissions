class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return intervals;
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        int n = intervals.length;
        int[][] merged = new int[n][2];
        int count = 0;

        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<n;i++){ 
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            if( nextStart<=end ){
                end = Math.max(end,nextEnd);
            }
            else{
                merged[count][0]= start;
                merged[count++][1]= end;
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        merged[count][0]= start;
        merged[count++][1]= end;
        return Arrays.copyOf(merged, count);
    }
}
