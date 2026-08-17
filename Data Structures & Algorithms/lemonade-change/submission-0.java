class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int fives=0, tens=0;
        for(int i: bills){
            if(i==5) fives++;
            else if(i==10){
                if(fives==0) return false;
                fives--;
                tens++;
            }
            else{
                if(fives==0 || (tens==0 && fives<3)) return false;
                if(tens>0) {
                    tens--;
                    fives--;
                }
                else{ fives -= 3;}
            }
        }
        return true;
    }
}