/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size()==0) return true;
        Collections.sort(intervals, (a,b) -> a.start-b.start);
        int n = intervals.size(), prev_end = intervals.get(0).end;
        for(int i=1;i<n;i++){
            if(intervals.get(i).start<prev_end) return false;
            prev_end = intervals.get(i).end;
        }
        return true;
    }
}
