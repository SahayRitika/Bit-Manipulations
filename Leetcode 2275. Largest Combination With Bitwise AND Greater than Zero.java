class Solution {
    public int largestCombination(int[] candidates) {
        int ans=Integer.MIN_VALUE, cnt;
        for(int i=0; i<32; i++){
            cnt=0;
            for(int candidate: candidates){
                if((candidate & (1 << i)) !=0){
                    cnt++;
                }
            }
            ans= Math.max(ans, cnt);
        }

        return ans;
    }
}
