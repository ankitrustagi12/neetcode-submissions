class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0) return 0;
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
        int n = intervals.length, prev_end = intervals[0][1];
        int count = 0;
        for(int i=1;i<n;i++){
            if(intervals[i][0]<prev_end){
                count++;
                continue;
            }
            prev_end = intervals[i][1];
        }
        return count;
    }
}
