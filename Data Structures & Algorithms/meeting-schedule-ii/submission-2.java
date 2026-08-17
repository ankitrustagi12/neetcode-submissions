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
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size()<=1) return intervals.size();
        List<Interval> updated = new ArrayList<>();
        for(Interval i : intervals){
            updated.add(new Interval(i.start,1));
            updated.add(new Interval(i.end,-1));
        }
        Collections.sort(updated, (a,b) -> {
            if(a.start==b.start){
                return a.end-b.end;}
            return a.start-b.start;
        });
        int n = updated.size();
        int count = 0, maxm =0;
        for(int i=0;i<n;i++){
            if(updated.get(i).end==-1){
                count--;
            }
            else{
                count++;
            }
            maxm = Math.max(maxm,count);
        }
        return maxm;
    }
}
