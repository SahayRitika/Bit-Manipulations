class Solution {
    public int minBitFlips(int start, int goal) {
        int num= start^goal;
        String binary= Integer.toBinaryString(num);
        int ans=0;
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i)=='1')
            ans++;
        }

        return ans;
    }
}

//optimised approach
class Solution {
    public int minBitFlips(int start, int goal) {
        int res = 0;

        while (start > 0 || goal > 0) {
            int rightStart = (start & 1);
            int rightGoal = (goal & 1);

            res += rightStart != rightGoal ? 1 : 0;
            
            start = start > 0 ? start >> 1 : 0;
            goal = goal > 0 ? goal >> 1 : 0;

        }


        return res;
    }
}
